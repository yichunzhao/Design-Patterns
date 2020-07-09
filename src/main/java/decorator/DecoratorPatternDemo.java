package decorator;

/**
 * Decorator pattern is used to add extra functionality to an existing object without altering its structure.
 *
 * @author YNZ
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        //basic coffee
        Coffee basicCoffee = new BasicCoffee();

        CoffeeDecorator milkDecorator = new MilkDecorator(basicCoffee);
        System.out.println(milkDecorator.coffeeType());

        CoffeeDecorator sugarDecorator = new SugarDecorator(milkDecorator);
        System.out.println(sugarDecorator.coffeeType());

    }
}
