# 🏠 Smart Home Remote Control

> A Java implementation of the **Command design pattern**, simulating a smart home remote control system.  
Control your lights and thermostat using command objects, with support for **undo** functionality.

---

## 📚 Overview

This project demonstrates the **Command behavioral pattern**, which decouples the invoker (remote control) from the receivers (devices like lights and thermostats).  
Each action is encapsulated in a command object, which can be executed and undone.

---

## 🧠 Design Pattern Used

- **Command Pattern**
  - Encapsulates all information needed to perform an action.
  - Allows undo and macro command functionality.
  - Promotes loose coupling between sender (remote) and receiver (devices).

---

## 📁 Project Structure

src/ ├── command/ │ ├── Command.java │ ├── TurnOnLightCommand.java │ └── SetThermostatCommand.java ├── device/ │ ├── Light.java │ └── Thermostat.java ├── remote/ │ └── SmartHomeRemoteControl.java └── Main.java

---

## 🚀 How to Run

### 1. Compile the project

If using terminal:

```bash
javac -d out src/**/*.java
java -cp out Main
[Light] Turning ON
[Thermostat] Setting temperature to 22°C
Undo last command:
[Thermostat] Reverting to previous temperature: 20°C
Undo again:
[Light] Turning OFF
[Light] Turning ON
[Thermostat] Setting temperature to 22°C
Undo last command:
