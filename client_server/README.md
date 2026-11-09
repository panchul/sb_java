# client_server

## Overview
Beginner networking examples using Java sockets.

## Files
- `SimpleServer.java` – listens on port `5000`, receives one message, sends a reply.
- `SimpleClient.java` – connects to localhost server, sends a message, reads reply.

## Run
Open two terminals in this folder:

**Terminal 1 (server):**
```bash
javac SimpleServer.java SimpleClient.java
java SimpleServer
```

**Terminal 2 (client):**
```bash
java SimpleClient
```
