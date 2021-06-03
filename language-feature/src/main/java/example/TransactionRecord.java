package example;

import java.util.Objects;

record TransactionRecord(String from, String to, int amount) {

    public TransactionRecord {
        Objects.requireNonNull(from);
        Objects.requireNonNull(to);
    }

    public TransactionRecord(String from, String to) {
        this(from, to, 0);
    }
}
