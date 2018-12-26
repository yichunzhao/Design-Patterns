package DecoratorPattern;

/**
 * @author YNZ
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String coffeeType() {
        return decorateCoffee.coffeeType() + " with milk";
    }
}
