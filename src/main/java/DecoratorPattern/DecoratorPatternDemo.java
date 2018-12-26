package DecoratorPattern;

/**
 * @author YNZ
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();

        CoffeeDecorator milkDecorator = new MilkDecorator(basicCoffee);
        System.out.println(milkDecorator.coffeeType());

        CoffeeDecorator sugarDecorator = new SugarDecorator(milkDecorator);
        System.out.println(sugarDecorator.coffeeType());

    }
}
