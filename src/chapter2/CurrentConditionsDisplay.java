package chapter2;

// Implement Observer so that it can get changes from the WeatherData(Subject) object.
// Implement DisplayElement because our API is going to require all display elements to implement this interface.
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData; // In the future, we may want to un-register 'this' observer object and it would be handy to already have a reference to the subject object.
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity.");
	}

}
