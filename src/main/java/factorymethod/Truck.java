package factorymethod;

public class Truck implements TransportProduct {

    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
