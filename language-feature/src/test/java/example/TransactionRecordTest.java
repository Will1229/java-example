package example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionRecordTest {

    @Test
    void transaction() {
        TransactionRecord transactionRecord = new TransactionRecord("you", "me", 100, "comments");
        TransactionRecord anotherTransactionRecord = new TransactionRecord("you", "me", 100, "comments");
        assertThat(transactionRecord.from()).isEqualTo("you");
        assertThat(transactionRecord.to()).isEqualTo("me");
        assertThat(transactionRecord.amount()).isEqualTo(100);
        assertThat(transactionRecord.otherComments()).isEqualTo("comments");
        assertThat(transactionRecord).isEqualTo(anotherTransactionRecord);
        assertThat(transactionRecord).hasSameHashCodeAs(anotherTransactionRecord);
        assertThat(transactionRecord).hasToString("TransactionRecord[from=you, to=me, amount=100, otherComments=comments]");
    }

    @Test
    void deserialize() throws JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();
        TransactionRecord result = objectMapper.readValue("""
                {"from":"you","to":"me","amount":100, "other_comments": "comments"}
                """, TransactionRecord.class);
        assertThat(result).isEqualTo(new TransactionRecord("you", "me", 100, "comments"));
    }

    @Test
    void serializeRecordObject() throws JsonProcessingException {
        final String json = new ObjectMapper().writeValueAsString(new TransactionRecord("you", "me", 100, "comments"));
        assertThat(json).isEqualTo("""
                {"other_comments":"comments","from":"you","to":"me","amount":100}""");
    }
}