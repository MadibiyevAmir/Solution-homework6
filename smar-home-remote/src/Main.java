import command.*;
import device.*;
import remote.SmartHomeRemoteControl;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermo22 = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.assignCommand("light_on", turnOnLight);
        remote.assignCommand("set_temp", setThermo22);

        remote.pressButton("light_on");
        remote.pressButton("set_temp");

        System.out.println("Undo last command:");
        remote.undoButton();  // Reverts thermostat

        System.out.println("Undo again:");
        remote.undoButton();  // Turns off light
    }
}
