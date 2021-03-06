package structural.decorator;

/**
 * @author YNZ
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String coffeeType(){
        return decoratedCoffee.coffeeType() + " with sugar";
    }
}
