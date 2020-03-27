package wtf.logs.nicobot.gommette;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class Gommette {

    private final String userId;
    private final String giverId;
    private final String reason;
    private final GommetteType type;
    private final Integer yesCount;
    private final Integer noCount;
    private final OffsetDateTime creationDate;
    private final Boolean valid;

    @JsonCreator
    public Gommette(@JsonProperty("userId") String userId,
                    @JsonProperty("giverId") String giverId,
                    @JsonProperty("reason") String reason,
                    @JsonProperty("type") GommetteType type,
                    @JsonProperty("yesCount") Integer yesCount,
                    @JsonProperty("noCount") Integer noCount,
                    @JsonProperty("creationDate") OffsetDateTime creationDate,
                    @JsonProperty("valid") Boolean valid) {
        this.userId = userId;
        this.giverId = giverId;
        this.reason = reason;
        this.type = type;
        this.yesCount = yesCount;
        this.noCount = noCount;
        this.creationDate = creationDate;
        this.valid = valid;
    }

    public String getUserId() {
        return userId;
    }

    public String getGiverId() {
        return giverId;
    }

    public String getReason() {
        return reason;
    }

    public GommetteType getType() {
        return type;
    }

    public Integer getYesCount() {
        return yesCount;
    }

    public Integer getNoCount() {
        return noCount;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public Boolean getValid() {
        return valid;
    }
}
