package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionRecordTest {

    @Test
    void transaction() {
        TransactionRecord transactionRecord = new TransactionRecord("you", "me", 100);
        TransactionRecord anotherTransactionRecord = new TransactionRecord("you", "me", 100);
        assertThat(transactionRecord.from()).isEqualTo("you");
        assertThat(transactionRecord.to()).isEqualTo("me");
        assertThat(transactionRecord.amount()).isEqualTo(100);
        assertThat(transactionRecord.equals(anotherTransactionRecord)).isTrue();
        assertThat(transactionRecord.hashCode()).isEqualTo(anotherTransactionRecord.hashCode());
        assertThat(transactionRecord.toString()).isEqualTo("TransactionRecord[from=you, to=me, amount=100]");
    }
}