package chapter6;

public class GarageDoor {
	
	private String state = "UP"; // Set default to UP

	public void up() {
		state = "UP";
		System.out.println("Garage Door is Open");
	}
	
	public void down() {
		state = "DOWN";
		System.out.println("Garage Door is Closed");
	}
	
	public String getState() {
		return state;
	}
	
	public void stop() {
		
	}
	
	public void lightOn() {
		
	}
	
	public void lightOff() {
		
	}
	
}
