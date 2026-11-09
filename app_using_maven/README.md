# app_using_maven

## Overview
A production-style Java example using a multi-module Maven build:

- `common` – shared validation helpers
- `pricing` – pricing and discount calculations
- `app` – executable application that depends on `common` and `pricing`

The project includes strict build settings, repeatable scripts, and unit tests in each module.

## Prerequisites
- JDK 17+
- Maven 3.9+

## Project structure
- `pom.xml` (parent/aggregator build)
- `common/` (independently buildable/testable package)
- `pricing/` (independently buildable/testable package)
- `app/` (application module)
- `scripts/` (production-oriented build and test scripts)

## Build and test all modules
From this folder:

```bash
./scripts/build.sh
```

## Run all tests
```bash
./scripts/test.sh
```

## Build and test an individual package
```bash
./scripts/build-module.sh common
./scripts/build-module.sh pricing
./scripts/build-module.sh app
```

## Run the app
```bash
mvn -B -q -pl app -am exec:java
```
