package org.proteus1121.behavioral.command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);

        System.out.println("Turning on the living room light:");
        remote.pressOnButton(0);

        System.out.println("\nTurning off the living room light:");
        remote.pressOffButton(0);

        System.out.println("\nUndoing the last action:");
        remote.pressUndoButton();

        System.out.println("\nTurning on the kitchen light:");
        remote.pressOnButton(1);

        System.out.println("\nTurning off the kitchen light:");
        remote.pressOffButton(1);

        System.out.println("\nUndoing the last action:");
        remote.pressUndoButton();
    }
}
