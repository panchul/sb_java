#!/usr/bin/env bash
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "${SCRIPT_DIR}/.." && pwd)"

mvn -B -q -f "${PROJECT_ROOT}/pom.xml" -pl app -am install -DskipTests
mvn -B -q -f "${PROJECT_ROOT}/app/pom.xml" exec:java
