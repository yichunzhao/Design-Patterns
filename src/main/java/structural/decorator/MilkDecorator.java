package structural.decorator;

/**
 * @author YNZ
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String coffeeType() {
        return decoratedCoffee.coffeeType() + " with milk";
    }
}
