package chapter6;

public class Light {
	
	String lightDesc;
	private String state = "OFF"; // Set default to OFF.
	
	public String getState() {
		return state;
	}
	
	public Light(String lightDesc) {
		this.lightDesc = lightDesc;
		System.out.println("Setting up " + lightDesc + ".");
	}
	
	public void on() {
		state = "ON";
		System.out.println(lightDesc + " is turing on...");
	}
	
	public void off() {
		state = "OFF";
		System.out.println(lightDesc + " is turing off...");
	}
}
