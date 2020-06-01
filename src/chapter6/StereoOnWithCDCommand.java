package chapter6;

public class StereoOnWithCDCommand implements Command {
	
	Stereo stereo;
//	String prevState = "";
	int prevVolumn = 0;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
//		prevState = stereo.getState();
		prevVolumn = stereo.getVolumn();
		stereo.on();
		stereo.setCD();
		stereo.setVolume(10);
	}

	@Override
	public void undo() {
//		switch (prevState) {
//			case "ON" :
//				stereo.on();
//				break;
//			case "OFF" :
//				stereo.off();
//				break;
//		}
		stereo.off(); // Just do the opposite of execute()
		stereo.setVolume(prevVolumn);
	}
	
}
