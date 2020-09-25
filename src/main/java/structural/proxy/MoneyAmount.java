package structural.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoneyAmount {

    private BigDecimal amount = new BigDecimal(0);

    static MoneyAmount of(long amount){
        return new MoneyAmount(BigDecimal.valueOf(amount));
    }

}
