package DecoratorPattern;

/**
 * @author YNZ
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decorateCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decorateCoffee = decoratedCoffee;
    }

    @Override
    public String coffeeType() {
        return decorateCoffee.coffeeType();
    }

}
