package chapter12;

public class RedheadDuck implements Quackable {

	private Observable observable;
	
	public RedheadDuck() { // In the constructor, we create an Observable and pass it a reference to the MallardDuck object.
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
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
