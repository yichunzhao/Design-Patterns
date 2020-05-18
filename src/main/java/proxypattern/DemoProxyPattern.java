package proxypattern;

public class DemoProxyPattern {

    public static void main(String[] args) {
        User user = new User("YYY");

        BankProxy bankProxy = new BankProxy(user);
        bankProxy.save(MoneyAmount.of(12000L));

        bankProxy.withdraw(MoneyAmount.of(2000L));

        System.out.println("Balance: " + bankProxy.getBalance());

    }
}
