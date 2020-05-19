package chapter2;

public interface Observer {
	
	// Input arguments - State values the observer get from the subject when a weather measurement changes.
	public void update(float temp, float humidity, float pressure);
	
}
