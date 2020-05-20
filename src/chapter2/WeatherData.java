package chapter2;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
	}
	
	// Notify observer objects when we get updated measurements from the weather station.
	public void measurementsChanged() {
		setChanged(); // We now first call setChanged() to indicate the state has changed before calling notifyObservers().
		notifyObservers(); // Notice we aren’t sending a data object with the notifyObservers() call. That means we’re using the PULL model
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
}
