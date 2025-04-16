package device;

public class Thermostat {
    private int currentTemperature = 20; // default
    private int previousTemperature;

    public void setTemperature(int temperature) {
        previousTemperature = currentTemperature;
        currentTemperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature: " + previousTemperature + "°C");
        currentTemperature = previousTemperature;
    }
}
