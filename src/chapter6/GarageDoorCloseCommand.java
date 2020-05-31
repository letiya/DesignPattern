package chapter6;

public class GarageDoorCloseCommand implements Command {
	
	GarageDoor garageDoor;
	String prevState = "";
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		prevState = garageDoor.getState();
		garageDoor.down();
	}

	@Override
	public void undo() {
		switch (prevState) {
			case "UP" :
				garageDoor.up();
				break;
			case "DOWN" :
				garageDoor.down();
				break;
		}
	}

}
