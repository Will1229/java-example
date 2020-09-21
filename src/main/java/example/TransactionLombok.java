package example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.With;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Builder
@With
public class TransactionLombok {
    private final String from;
    private final String to;
    private final int amount;
}

