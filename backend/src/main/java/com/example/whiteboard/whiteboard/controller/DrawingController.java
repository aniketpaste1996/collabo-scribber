package com.example.whiteboard.whiteboard.controller;

import com.example.whiteboard.whiteboard.model.DrawingMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class DrawingController {

    private final SimpMessagingTemplate messagingTemplate;

    public DrawingController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/board/{boardId}")
    public void broadcastDrawing(@Payload DrawingMessage message) {
        messagingTemplate.convertAndSend("/topic/board/" + message.boardId, message);
    }
}
