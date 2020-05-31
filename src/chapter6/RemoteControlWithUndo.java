package chapter6;

public class RemoteControlWithUndo {
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	private final int slotNums = 7;
	
	public RemoteControlWithUndo() {
		onCommands = new Command[slotNums];
		offCommands = new Command[slotNums];
		
		// Initialize the on and off arrays.
		Command noCommand = new NoCommand();
		for (int i = 0; i < slotNums; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
