package com.chatgpt.springbootchatgpt.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class ChatGPTRequest {

    private String model = "gpt-3.5-turbo";

    @SerializedName("messages")
    private List<Message> messages;

    private int temperature = 1;

    @SerializedName(value = "max_tokens")
    private int maxTokens = 2000;

    // Constructor
    public ChatGPTRequest(String prompt) {
        Message message = new Message("system", prompt);
        this.messages = Collections.singletonList(message);
    }

    // Inner class for message
    @Data
    public static class Message {
        private String role;
        private String content;

        public Message(String role, String content) {
            this.role = role;
            this.content = content;
        }
    }
}
