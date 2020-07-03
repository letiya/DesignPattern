package chapter12;

public class DuckCall implements Quackable {

	private Observable observable;
	
	public DuckCall() { // In the constructor, we create an Observable and pass it a reference to the MallardDuck object.
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
