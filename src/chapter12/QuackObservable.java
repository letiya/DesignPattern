package chapter12;

// QuackObservable is the interface that Quackables should implement if they want to be observed.
public interface QuackObservable {

	public void registerObserver(Observer observer);
	public void notifyObservers();

}
