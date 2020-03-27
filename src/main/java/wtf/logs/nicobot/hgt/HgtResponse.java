package wtf.logs.nicobot.hgt;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class HgtResponse {

    private final Collection<HgtScore> scores;

    @JsonCreator
    HgtResponse(@JsonProperty("scores") Collection<HgtScore> scores) {
        this.scores = scores;
    }

    public Collection<HgtScore> getScores() {
        return scores;
    }
}
