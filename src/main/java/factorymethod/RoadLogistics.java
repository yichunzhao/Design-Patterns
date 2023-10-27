package factorymethod;

public class RoadLogistics extends Logistics {

    @Override
    TransportProduct createTransport() {
        return new Truck();
    }
}

