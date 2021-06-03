package example;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionLombokTest {

    @Test
    void transaction() {
        TransactionLombok transactionLombok = new TransactionLombok("you", "me", 100);
        TransactionLombok anotherTransactionLombok = new TransactionLombok("you", "me", 100);
        assertThat(transactionLombok.getFrom()).isEqualTo("you");
        assertThat(transactionLombok.getTo()).isEqualTo("me");
        assertThat(transactionLombok.getAmount()).isEqualTo(100);
        assertThat(transactionLombok.equals(anotherTransactionLombok)).isTrue();
        assertThat(transactionLombok.hashCode()).isEqualTo(anotherTransactionLombok.hashCode());
        assertThat(transactionLombok.toString()).isEqualTo("TransactionLombok(from=you, to=me, amount=100)");
    }


}