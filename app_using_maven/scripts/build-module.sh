#!/usr/bin/env bash
set -euo pipefail

if [ "$#" -ne 1 ]; then
  echo "Usage: $0 <module-name>"
  echo "Example: $0 common"
  exit 1
fi

MODULE="$1"
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "${SCRIPT_DIR}/.." && pwd)"

mvn -B -f "${PROJECT_ROOT}/pom.xml" -pl "${MODULE}" -am clean verify
