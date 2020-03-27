package wtf.logs.nicobot.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Paging {

    private final int start;
    private final int limit;
    private final int total;

    @JsonCreator
    Paging(@JsonProperty("start") int start,
           @JsonProperty("limit") int limit,
           @JsonProperty("total") int total) {
        this.start = start;
        this.limit = limit;
        this.total = total;
    }

    public int getStart() {
        return start;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }
}
