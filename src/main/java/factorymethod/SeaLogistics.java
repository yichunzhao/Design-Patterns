package factorymethod;

public class SeaLogistics extends Logistics {

    @Override
    TransportProduct createTransport() {
        return new Ship();
    }
}
