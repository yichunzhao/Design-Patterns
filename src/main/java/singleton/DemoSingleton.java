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

class BookingManager {

    public void booking() {
        System.out.println("manager is booking...");
    }

}

enum BookingManagerSingleton {
    INSTANCE;

    // thread safe
    public BookingManager bookingManager;

    private BookingManagerSingleton() {
        this.bookingManager = new BookingManager();
    }

}

public class DemoSingleton {
    public static void main(String[] args) {
        BookingManager b1 = BookingManagerSingleton.INSTANCE.bookingManager;
        BookingManager b2 = BookingManagerSingleton.INSTANCE.bookingManager;

        if (b1 == b2) System.out.println("having the same reference");

    }
}
