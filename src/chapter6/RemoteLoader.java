package chapter6;

public class RemoteLoader {

	public static void main(String[] args) {
		// Create all devices in their proper location. 
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room Light");
		Light kitchenLight = new Light("Kitchen Light");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		// Create light commands
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		// Create garage door command
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		
		// Create stereo commands
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		// Set up remote
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, garageDoorUp, garageDoorCloseCommand);
		remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.onButtonWasPushed(2);
//		remoteControl.onButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(0);
		
		// Add a party mode
		// Create all devices in their proper location. 
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		
		Command[] partyOn = {livingRoomLightOn, garageDoorUp, stereoOnWithCDCommand};
		Command[] partyOff = {livingRoomLightOff, garageDoorCloseCommand, stereoOffCommand};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		System.out.println("--- Pushing Macro On---");
		remoteControlWithUndo.setCommand(4, partyOnMacro, partyOffMacro);
		remoteControlWithUndo.onButtonWasPushed(4);
		
		System.out.println("--- Undo pushing Macro On---");
		remoteControlWithUndo.undoButtonWasPushed();
		
	}

}
