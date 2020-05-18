package proxypattern;

import java.math.BigDecimal;

public class Bank implements AccountAccess {

    private BigDecimal balance = new BigDecimal(0);

    @Override
    public BigDecimal withdraw(MoneyAmount withdrawAmount) {

        if (balance.compareTo(withdrawAmount.getAmount()) == 1) {
            balance = balance.subtract(withdrawAmount.getAmount());
            System.out.println("withdraw amount : " + withdrawAmount.getAmount());
            return withdrawAmount.getAmount();
        }

        return BigDecimal.ZERO;
    }

    @Override
    public void save(MoneyAmount amount) {
        balance = balance.add(amount.getAmount());
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }
}
