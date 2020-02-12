package be.zqsd.nicobot.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Message {

    private final LocalDateTime postedDate;
    private final String username;
    private final String message;

    @JsonCreator
    public Message(@JsonProperty("postedDate") LocalDateTime postedDate,
                   @JsonProperty("username") String username,
                   @JsonProperty("message") String message) {
        this.postedDate = postedDate;
        this.username = username;
        this.message = message;
    }

    public LocalDateTime getPostedDate() {
        return postedDate;
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }
}
