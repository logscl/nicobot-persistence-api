package wtf.logs.nicobot.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class MessageRequest {

    private final Collection<Message> messages;

    @JsonCreator
    public MessageRequest(@JsonProperty("messages") Collection<Message> messages) {
        this.messages = messages;
    }

    public Collection<Message> getMessages() {
        return messages;
    }
}
