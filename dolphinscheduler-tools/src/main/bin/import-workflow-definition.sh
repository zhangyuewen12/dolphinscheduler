#!/bin/bash
#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

set -euo pipefail

usage() {
  echo "Usage: $0 <project-name> <workflow-name> <worker-group> <username> <password> <workflow-json-file>"
  echo
  echo "Environment:"
  echo "  DS_API_URL  DolphinScheduler API base URL, default: http://localhost:12345/dolphinscheduler"
}

if [ "$#" -ne 6 ]; then
  usage
  exit 1
fi

PROJECT_NAME="$1"
WORKFLOW_NAME="$2"
WORKER_GROUP="$3"
USERNAME="$4"
PASSWORD="$5"
WORKFLOW_FILE="$6"
DS_API_URL="${DS_API_URL:-http://localhost:12345/dolphinscheduler}"
DS_API_URL="${DS_API_URL%/}"

if [ ! -f "$WORKFLOW_FILE" ]; then
  echo "Workflow json file does not exist: $WORKFLOW_FILE" >&2
  exit 1
fi

if ! command -v curl >/dev/null 2>&1; then
  echo "curl is required to import workflow definitions" >&2
  exit 1
fi

# Keep the worker-side client intentionally thin: authentication, target names,
# and file upload only. The API server owns project lookup, online/offline checks,
# and create/update.
LOGIN_RESPONSE=$(curl -sS -X POST "$DS_API_URL/login" \
  --data-urlencode "userName=$USERNAME" \
  --data-urlencode "userPassword=$PASSWORD")

SESSION_ID=$(printf "%s" "$LOGIN_RESPONSE" | sed -n 's/.*"sessionId"[[:space:]]*:[[:space:]]*"\([^"]*\)".*/\1/p')
if [ -z "$SESSION_ID" ]; then
  echo "Login failed or sessionId was not returned:" >&2
  echo "$LOGIN_RESPONSE" >&2
  exit 1
fi

IMPORT_RESPONSE=$(curl -sS -X POST "$DS_API_URL/workflow-definition/import" \
  -H "sessionId: $SESSION_ID" \
  --data-urlencode "projectName=$PROJECT_NAME" \
  --data-urlencode "workflowName=$WORKFLOW_NAME" \
  --data-urlencode "workerGroup=$WORKER_GROUP" \
  --data-urlencode "workflowDefinitionJson@$WORKFLOW_FILE")

CODE=$(printf "%s" "$IMPORT_RESPONSE" | sed -n 's/^[[:space:]]*{"code"[[:space:]]*:[[:space:]]*\([0-9-]*\).*/\1/p')
if [ -z "$CODE" ]; then
  echo "Import response does not contain a code field:" >&2
  echo "$IMPORT_RESPONSE" >&2
  exit 1
fi
if [ "$CODE" != "0" ]; then
  echo "Import failed:" >&2
  echo "$IMPORT_RESPONSE" >&2
  exit 1
fi

echo "$IMPORT_RESPONSE"
