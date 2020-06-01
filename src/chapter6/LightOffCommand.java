package chapter6;

public class LightOffCommand implements Command {
	
	Light light;
//	String prevState = "";
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
//		prevState = light.getState();
		light.off();
	}

	@Override
	public void undo() {
//		switch (prevState) {
//			case "ON" :
//				light.on();
//				break;
//			case "OFF" :
//				light.off();
//				break;
//		}
		light.on(); // Just do the opposite of execute()
	}

}
