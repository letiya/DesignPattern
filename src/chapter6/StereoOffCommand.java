package chapter6;

public class StereoOffCommand implements Command {
	
	Stereo stereo;
	String prevState = "";
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		prevState = stereo.getState();
		stereo.off();
	}
	
	@Override
	public void undo() {
		switch (prevState) {
			case "ON" :
				stereo.on();
				break;
			case "OFF" :
				stereo.off();
				break;
		}
	}

}
