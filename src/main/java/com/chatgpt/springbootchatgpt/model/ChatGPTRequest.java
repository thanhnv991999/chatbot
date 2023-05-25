package com.chatgpt.springbootchatgpt.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ChatGPTRequest {

    private String model = "gpt-3.5-turbo";
    private String prompt;
    private int temperature = 0;

    @SerializedName(value="max_tokens")
    private int maxTokens = 100;
}
