package com.example.whiteboard.whiteboard.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @PostMapping
    public Map<String, String> createBoard() {
        String boardId = UUID.randomUUID().toString();
        return Map.of("boardId", boardId);
    }
}