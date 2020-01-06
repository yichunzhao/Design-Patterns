package singleton;

/**
 * when needing a singleton pattern? multiple threads access a common resource.
 * <p>
 * how to implementing singleton?
 * method 1
 * 1) private static instance, and private constructor
 * 2) lazy loaded instance
 * 3) complete or partial synchronize method
 * <p>
 * method 2
 * using enum; an element of an enum is always single. enum can not be used to
 * instantiate a new instance(private constructor).
 */

enum BookingManagerSingleton {
    // a single instance.
    INSTANCE;

    // thread safe
    public void booking() {
        System.out.println("manager:" + this.hashCode() + " is booking...");
    }

}

public class DemoEnumSingleton {
    public static void main(String[] args) {
        BookingManagerSingleton b1 = BookingManagerSingleton.INSTANCE;
        BookingManagerSingleton b2 = BookingManagerSingleton.INSTANCE;

        if (b1 == b2) System.out.println("having the same reference");

        b1.booking();
        b2.booking();

    }
}
