package factorymethod;

public class Ship implements TransportProduct {

    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}

