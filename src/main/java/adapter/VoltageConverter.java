package adapter;

/**
 * Convert 220 voltage to 110 voltage
 */

public class VoltageConverter implements PowerSource110Volt {

    private PowerSource220Volt powerSource220Volt;

    public VoltageConverter(PowerSource220Volt powerSource220Volt) {
        this.powerSource220Volt = powerSource220Volt;
    }

    @Override
    public int getVoltage() {
        return powerSource220Volt.getVoltage()/2;
    }
}
