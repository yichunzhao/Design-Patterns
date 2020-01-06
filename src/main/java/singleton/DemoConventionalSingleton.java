package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class BookingManger {

    public BookingManger() {
    }

    public void booking(int seq) {
        System.out.println("for th: " + seq + " Booking manager: " + this.hashCode() + " booking ...");
    }

}

class AnotherBookingManagerSingleton {
    //static instance
    private static BookingManger bookingManger = null;

    //private constructor
    private AnotherBookingManagerSingleton() {
    }

    //synchronize method
    synchronized public static BookingManger getInstance() {
        if (bookingManger == null) {
            bookingManger = new BookingManger();
        }
        return bookingManger;
    }
}

class BookingTask implements Runnable {
    //composition of booking manager
    private BookingManger bookingManger = AnotherBookingManagerSingleton.getInstance();

    //thread seq
    private int seq;

    public BookingTask(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        this.bookingManger.booking(seq);
    }
}

public class DemoConventionalSingleton {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        IntStream.rangeClosed(0, 100).forEach(i ->
                {
                    BookingTask bookingTask = new BookingTask(i);
                    executorService.submit(bookingTask);

                }
        );

        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        executorService.shutdown();

    }
}
