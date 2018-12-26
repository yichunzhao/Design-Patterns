package DecoratorPattern;

/**
 * @author YNZ
 */
public class BasicCoffee implements Coffee {
    @Override
    public String coffeeType() {
        return "basic coffee";
    }
}
