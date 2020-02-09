package be.zqsd.hgt;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class HgtRequest {

    private final Collection<String> users;

    @JsonCreator
    public HgtRequest(@JsonProperty("users") Collection<String> users) {
        this.users = users;
    }

    public Collection<String> getUsers() {
        return users;
    }
}
