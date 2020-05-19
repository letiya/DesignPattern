package chapter2;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers; // To hold observer objects.
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	// Notify observer objects when we get updated measurements from the weather station.
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
	}

}
