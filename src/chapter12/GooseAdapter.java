package chapter12;

public class GooseAdapter implements Quackable { // Adapter implements a target(client) interface.
	
	private Goose goose;
	private Observable observable;
	
	public GooseAdapter(Goose goose) { // The constructor keeps a goose(adaptee) reference.
		this.goose = goose;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
		observable.notifyObservers();
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
