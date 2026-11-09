# sb_java

A beginner-friendly Java sandbox repository organized by core programming topics.

## Prerequisites

- **JDK 17+** (11+ also works for most basic examples)
- A terminal/command prompt
- Optional IDE: IntelliJ IDEA, VS Code (Java extensions), or Eclipse
- **Maven 3.9+** (required for `app_using_maven`)
- **Gradle** (optional for `app_using_gradle` because Gradle Wrapper is included)

Check your Java installation:

```bash
java -version
javac -version
```

Check Maven and Gradle:

```bash
mvn -version
gradle -version
```

If Gradle is not installed globally, that is fine for `app_using_gradle`; use:

```bash
cd app_using_gradle
./gradlew -version
```

## Installing Maven and Gradle

Installers depend on your OS and package manager. Common options:

- **macOS (Homebrew)**  
  `brew install maven gradle`
- **Ubuntu/Debian**  
  `sudo apt update && sudo apt install -y maven gradle`
- **Windows (winget)**  
  `winget install Apache.Maven`  
  `winget install Gradle.Gradle`

After installation, re-run:

```bash
mvn -version
gradle -version
```

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/panchul/sb_java.git
   cd sb_java
   ```
2. Pick a topic folder and read its local `README.md`.
3. Compile and run examples from inside that folder:
   ```bash
   javac *.java
   java ClassName
   ```

## Topic folders

- `basics` – variables, primitive types, operators
- `control_flow` – `if/else`, loops, `switch`
- `methods` – method declaration, parameters, return values
- `object_oriented_programming` – classes, objects, inheritance
- `collections` – `List`, `Set`, `Map`
- `exception_handling` – `try/catch`, `throw`, custom exceptions
- `string_manipulations` – common string processing techniques
- `file_io` – read/write files with modern APIs
- `multithreading` – thread basics and synchronization
- `client_server` – networking with sockets
- `app_using_maven` – production-style multi-module Maven application
- `app_using_gradle` – production-style multi-module Gradle application

## Learning path for beginners

1. `basics`
2. `control_flow`
3. `methods`
4. `object_oriented_programming`
5. `collections`
6. `exception_handling`
7. `string_manipulations`
8. `file_io`
9. `multithreading`
10. `client_server`
