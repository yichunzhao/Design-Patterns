package structural.proxy;

import java.math.BigDecimal;

public interface AccountAccess {

    BigDecimal withdraw(MoneyAmount amount);

    void save(MoneyAmount amount);

    BigDecimal getBalance();
}
