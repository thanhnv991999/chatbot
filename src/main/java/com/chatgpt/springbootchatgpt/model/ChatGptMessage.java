package com.chatgpt.springbootchatgpt.model;

import lombok.Data;

@Data
public class ChatGptMessage {
    private String role;
    private String content;
}

