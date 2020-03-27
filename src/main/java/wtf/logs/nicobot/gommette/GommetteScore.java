package wtf.logs.nicobot.gommette;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GommetteScore {

    private final String userId;
    private final Integer redCount;
    private final Integer greenCount;
    private final Integer score;

    @JsonCreator
    GommetteScore(@JsonProperty("userId") String userId,
                  @JsonProperty("redCount") Integer redCount,
                  @JsonProperty("greenCount") Integer greenCount,
                  @JsonProperty("score") Integer score) {
        this.userId = userId;
        this.redCount = redCount;
        this.greenCount = greenCount;
        this.score = score;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getRedCount() {
        return redCount;
    }

    public Integer getGreenCount() {
        return greenCount;
    }

    public Integer getScore() {
        return score;
    }
}
