# app_using_gradle

## Overview
A production-style Java example using a multi-module Gradle build:

- `common` – shared validation helpers
- `pricing` – pricing and discount calculations
- `app` – executable application that depends on `common` and `pricing`

The project includes strict Java toolchain configuration, repeatable scripts, and unit tests in each module.

## Prerequisites
- JDK 11+ (required to run Gradle itself)
- JDK 17 toolchain (used for compiling/testing this project; can be auto-downloaded)
- No global Gradle installation is required (the Gradle Wrapper is included)

## Project structure
- `settings.gradle` (module registry)
- `build.gradle` (shared build configuration)
- `gradle.properties` (toolchain auto-detection/auto-download flags)
- `gradlew` and `gradlew.bat` (Gradle Wrapper launchers for macOS/Linux and Windows)
- `gradle/wrapper/gradle-wrapper.jar` + `gradle/wrapper/gradle-wrapper.properties` (wrapper runtime/config)
- `common/` (independently buildable/testable package)
- `pricing/` (independently buildable/testable package)
- `app/` (application module)
- `scripts/` (production-oriented build and test scripts)

## Why Gradle Wrapper is included
The wrapper makes the build reproducible and easier to use:

1. **Pinned Gradle version**  
   The wrapper pins the project to Gradle 8.7 (`gradle-wrapper.properties`), so every developer and CI job uses the same Gradle version.

2. **No manual Gradle setup**  
   New contributors only need Java. Running `./gradlew ...` automatically downloads the required Gradle distribution on first use.

3. **Safer automation/CI**  
   Build scripts and pipelines call the checked-in wrapper instead of whatever `gradle` happens to be installed on a machine.

4. **Cross-platform consistency**  
   `gradlew` (Unix/macOS) and `gradlew.bat` (Windows) provide the same project-specific entrypoint.

## What each wrapper file does

- `gradlew`  
  Unix/macOS launcher script. This is the command most contributors will run locally and in Linux-based CI.

- `gradlew.bat`  
  Windows launcher script. It gives Windows users the same wrapper behavior as `gradlew`.

- `gradle/wrapper/gradle-wrapper.properties`  
  Wrapper configuration. It defines which Gradle distribution to use (`gradle-8.7-bin.zip`) and where to cache it.

- `gradle/wrapper/gradle-wrapper.jar`  
  Small bootstrap runtime used by the launcher scripts. It reads `gradle-wrapper.properties`, downloads the pinned Gradle version if missing, and then starts that Gradle version.

## Build and test all modules
```bash
./scripts/build.sh
```

You can also call the wrapper directly:
```bash
./gradlew clean build
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
./scripts/run.sh
```

## Troubleshooting: "Cannot find a Java installation ... languageVersion=17"

If you get an error like:

`Cannot find a Java installation ... languageVersion=17 ... toolchain download repositories have not been configured`

this project now configures Gradle toolchain provisioning (`org.gradle.toolchains.foojay-resolver-convention`) and enables auto-download in `gradle.properties`.

Try:

```bash
./gradlew --stop
./gradlew clean build
```

If your machine is offline or behind a restrictive proxy, install JDK 17 locally and re-run:

```bash
java -version
./scripts/build.sh
```
