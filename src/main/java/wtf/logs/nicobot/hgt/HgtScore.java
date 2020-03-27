package wtf.logs.nicobot.hgt;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HgtScore {

    private final String userId;
    private final int score;

    @JsonCreator
    public HgtScore(@JsonProperty("userId") String userId,
             @JsonProperty("score") int score) {
        this.userId = userId;
        this.score = score;
    }

    public String getUserId() {
        return userId;
    }

    public int getScore() {
        return score;
    }
}
