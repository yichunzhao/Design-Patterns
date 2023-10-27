package factorymethod;

public abstract class Logistics {

    public void deliver() {
        TransportProduct product = createTransport();
        product.deliver();
    }

    abstract TransportProduct createTransport();
}
