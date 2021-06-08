package example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

record TransactionRecord(String from, String to, int amount, @JsonProperty("other_comments") String otherComments) {

    public TransactionRecord {
        Objects.requireNonNull(from);
        Objects.requireNonNull(to);
    }

    public TransactionRecord(String from, String to) {
        this(from, to, 0, "");
    }

    public TransactionRecord(final String from, final String to, final int amount) {
        this(from, to, amount, "");
    }
}
