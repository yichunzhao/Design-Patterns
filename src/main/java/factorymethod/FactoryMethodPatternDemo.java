package factorymethod;

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.deliver();

        logistics = new SeaLogistics();
        logistics.deliver();
    }
}
