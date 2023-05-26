package com.chatgpt.springbootchatgpt.model;

import lombok.Data;

@Data
public class ChatGptChoice {
    private ChatGptMessage message;
    private String finish_reason;
    private double index;

    public String getText() {
        return message.getContent();
    }
}
