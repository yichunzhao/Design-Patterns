package adapter;

public class DemoVoltageAdapter {

    public static void main(String[] args) {

        PowerSource220Volt powerSource220Volt = new HomePowerSocket();

        VoltageConverter voltageConverter = new VoltageConverter(powerSource220Volt);

        System.out.println("output voltage from converter: " + voltageConverter.getVoltage());

    }
}
