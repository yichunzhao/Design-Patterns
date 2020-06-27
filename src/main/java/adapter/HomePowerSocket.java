package adapter;

public class HomePowerSocket implements PowerSource220Volt {

    @Override
    public int getVoltage() {
        return 220;
    }
}
