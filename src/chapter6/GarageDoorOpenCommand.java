package chapter6;

public class GarageDoorOpenCommand implements Command {
	
	GarageDoor garageDoor;
//	String prevState = "";

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();
	}
	
	@Override
	public void undo() {
//		switch (prevState) {
//			case "UP" :
//				garageDoor.up();
//				break;
//			case "DOWN" :
//				garageDoor.down();
//				break;
//		}
		garageDoor.down(); // Just do the opposite of execute()
	}
	
}
