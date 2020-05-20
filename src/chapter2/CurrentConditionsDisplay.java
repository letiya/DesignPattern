package chapter2;

import java.util.Observable;
import java.util.Observer;

// We now are implementing the Observer interface from java.util.
// Implement DisplayElement because our API is going to require all display elements to implement this interface.
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	Observable observable;
	private float temp;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity.");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
