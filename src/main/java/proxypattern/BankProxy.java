package proxypattern;

import java.math.BigDecimal;

public class BankProxy implements AccountAccess {

    private User user;

    private Bank bank;

    public BankProxy(User user) {
        this.user = user;
    }

    @Override
    public BigDecimal withdraw(MoneyAmount amount) {
        checkUser();

        if (bank == null) bank = new Bank();

        return bank.withdraw(amount);
    }

    @Override
    public void save(MoneyAmount amount) {
        checkUser();

        if (bank == null) bank = new Bank();
        bank.save(amount);
    }

    @Override
    public BigDecimal getBalance() {
        checkUser();
        if (bank == null) bank = new Bank();

        return bank.getBalance() ;
    }


    private void checkUser() {
        if (user.getName() != "YYY") throw new IllegalUserException("the user is valid.");
    }

}
