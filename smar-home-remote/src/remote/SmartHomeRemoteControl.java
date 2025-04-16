package remote;

import command.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void assignCommand(String slotName, Command command) {
        slots.put(slotName, command);
    }

    public void pressButton(String slotName) {
        Command command = slots.get(slotName);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("No command assigned to slot: " + slotName);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
