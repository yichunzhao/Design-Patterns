package prototype;

/**
 * Prototype is a creation pattern. It handles a case when the instance is expense to be created again, for instance it
 * entails a database connection to init. the states. So using this pattern may take use of existing states to create
 * a new instance in a cheap way.
 */
public class DemoPrototype {

    public static void main(String[] args) {

        Address address = Address.builder().city("copenhagen").street("xxx street").zip("2300").build();
        Person person = Person.builder().name("mike").address(address).build();
        System.out.println("origin: " + person + "id: " + System.identityHashCode(person));

        Person cloned = person.makeCopy();
        System.out.println("cloned: " + cloned + "id: " + System.identityHashCode(cloned));

    }
}
