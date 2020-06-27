package adapter;

/**
 * Adapter have two interface and a concrete body Just like a real adapter.
 * It is used to handle existing code without altering its structure and code, and reformatting its output or say
 * behaviours to adapt to the client side structure or whatever input requirements.
 */
public class DemoVoltageAdapter {

    public static void main(String[] args) {

        PowerSource220Volt powerSource220Volt = new HomePowerSocket();

        VoltageConverter voltageConverter = new VoltageConverter(powerSource220Volt);

        System.out.println("output voltage from converter: " + voltageConverter.getVoltage());

    }
}
