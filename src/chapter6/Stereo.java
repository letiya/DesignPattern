package chapter6;

public class Stereo {
	
//	private String state = "OFF"; // Set default to OFF.
	private int volumn = 0;
	
//	public String getState() {
//		return state;
//	}
	
	public int getVolumn() {
		return volumn;
	}
	
	public Stereo(String stereoLocation) {
		System.out.println("Setting up stereo at " + stereoLocation);
	}
	
	public void on() {
//		state = "ON";
		System.out.println("Stereo is turing on...");
	}
	
	public void off() {
//		state = "OFF";
		System.out.println("Stereo is turing off...");
	}
	
	public void setCD() {
		System.out.println("Stereo is loading CD...");
	}
	
	public void setVolume(int num) {
		volumn = num;
		System.out.println("Stereo is adjusting volumne to " + num);
	}

}
