## ✨ Features
- Real-time drawing with WebSockets and STOMP
- Freehand and rectangle drawing tools
- Color picker
- Board ID support via URL query (`?boardId=`)
- Dockerized Spring Boot + Nginx frontend

## 🗂️ Project Structure
```
collabo-board/
├── backend/                 # Spring Boot WebSocket backend (Gradle)
│   ├── Dockerfile
│   ├── build.gradle
│   └── src/main/java/com/example/whiteboard/
│       ├── WhiteboardApplication.java
│       ├── config/WebSocketConfig.java
│       ├── controller/BoardController.java
│       ├── controller/DrawingController.java
│       ├── model/DrawingMessage.java
│       └── service/BoardService.java
├── frontend/                # Static frontend served via Nginx
│   ├── Dockerfile
│   └── public/index.html
├── docker-compose.yml       # Docker setup for local development
```

## 🚀 Getting Started
### 1. Clone the project
```bash
git clone https://github.com/your-username/collabo-board.git
cd collabo-board
```

### 2. Start the app
```bash
docker-compose up --build
```
- Frontend: [http://localhost:3000/?boardId=test](http://localhost:3000/?boardId=test)
- Backend: `http://localhost:8080`

> You can open the same board ID in two browser tabs to test collaboration.

## 🛠️ Tech Stack
- **Backend:** Java 17, Spring Boot, STOMP over WebSocket
- **Frontend:** HTML Canvas, Vanilla JS, SockJS + STOMP
- **Containerization:** Docker + Docker Compose

## 🧭 Future MVP Ideas
- User cursors & names
- Save board as image or JSON
- Undo/redo support
- Authentication and private boards

---
Made with 💡 by Aniket Paste