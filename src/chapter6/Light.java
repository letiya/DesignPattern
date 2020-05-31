package chapter6;

public class Light {
	
	String lightDesc;
	
	public Light(String lightDesc) {
		this.lightDesc = lightDesc;
		System.out.println("Setting up " + lightDesc + ".");
	}
	
	public void on() {
		System.out.println(lightDesc + " is turing on...");
	}
	
	public void off() {
		System.out.println(lightDesc + " is turing off...");
	}
}
