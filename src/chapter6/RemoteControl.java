package chapter6;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	private final int slotNums = 7;
	
	public RemoteControl() {
		onCommands = new Command[slotNums];
		offCommands = new Command[slotNums];
		
		// Initialize the on and off arrays.
		Command noCommand = new NoCommand();
		for (int i = 0; i < slotNums; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("------ Remote Control -------");
		for (int i = 0; i < slotNums; i++) {
			stringBuff.append("Slot " + i + " " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName());
		}
		return stringBuff.toString();
	}
	
}
