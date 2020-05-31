package chapter6;

public class Stereo {
	
	public Stereo(String stereoLocation) {
		System.out.println("Setting up stereo at " + stereoLocation);
	}
	
	public void on() {
		System.out.println("Stereo is turing on...");
	}
	
	public void off() {
		System.out.println("Stereo is turing off...");
	}
	
	public void setCD() {
		System.out.println("Stereo is loading CD...");
	}
	
	public void setVolume(int num) {
		System.out.println("Stereo is adjusting volumne...");
	}

}
