package Command;

//TestCommandPattern.java
public class TestCommandPattern {
 public static void main(String[] args) {
     // Create the receiver
     Light light = new Light();
     
     // Create concrete command objects
     Command lightOn = new LightOnCommand(light);
     Command lightOff = new LightOffCommand(light);
     
     // Create the invoker (RemoteControl)
     RemoteControl remote = new RemoteControl();
     
     // Test the light ON command
     remote.setCommand(lightOn);
     remote.pressButton();
     
     // Test the light OFF command
     remote.setCommand(lightOff);
     remote.pressButton();
 }
}