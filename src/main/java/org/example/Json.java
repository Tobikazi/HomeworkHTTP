package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Json {
    private final String id;
    private final String text;
    private final String upvotes;

    public Json(
            @JsonProperty("id") String id, @JsonProperty("text") String text, @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.upvotes = upvotes;
    }
    public String getUpvotes() {
        return upvotes;
    }
    @Override
    public String toString() {
        return "Пользователь под индивидуальным номером с высоким количеством голосов - " + id +
                " пишет следующее: " + text;
    }
}

