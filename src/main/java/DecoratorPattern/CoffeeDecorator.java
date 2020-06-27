package DecoratorPattern;

/**
 * @author YNZ
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String coffeeType() {
        return decoratedCoffee.coffeeType();
    }

}
