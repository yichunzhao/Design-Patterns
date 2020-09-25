package structural.proxy;

/**
 *  proxy works as a surrogate of another instance. This code example demo one of its usages, i.e. wrapping extra
 *  security check for the delegated instance. So it keeps classes cohesive.
 */

public class DemoProxyPattern {

    public static void main(String[] args) {
        User user = new User("YYY");

        BankProxy bankProxy = new BankProxy(user);
        bankProxy.save(MoneyAmount.of(12000L));

        bankProxy.withdraw(MoneyAmount.of(2000L));

        System.out.println("Balance: " + bankProxy.getBalance());

    }
}
