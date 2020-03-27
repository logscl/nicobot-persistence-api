package wtf.logs.nicobot.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;

public class MessageResponse {

    private final Collection<Message> messages;
    private final Paging paging;

    @JsonCreator
    MessageResponse(@JsonProperty("messages") Collection<Message> messages,
                    @JsonProperty("paging") Paging paging) {
        this.messages = messages;
        this.paging = paging;
    }

    public Collection<Message> getMessages() {
        return ofNullable(messages).orElse(emptyList());
    }

    public Paging getPaging() {
        return paging;
    }
}
