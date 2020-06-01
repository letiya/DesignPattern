package chapter6;

public class LightOnCommand implements Command {

	Light light;
//	String prevState = "";
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
//		prevState = light.getState();
		light.on();
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
		light.off(); // Just do the opposite of execute()
	}
}
