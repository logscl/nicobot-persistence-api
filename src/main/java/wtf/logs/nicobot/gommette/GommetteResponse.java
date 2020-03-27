package wtf.logs.nicobot.gommette;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class GommetteResponse {

    private final Collection<GommetteScore> scores;

    @JsonCreator
    GommetteResponse(@JsonProperty("scores") Collection<GommetteScore> scores) {
        this.scores = scores;
    }

    public Collection<GommetteScore> getScores() {
        return scores;
    }
}
