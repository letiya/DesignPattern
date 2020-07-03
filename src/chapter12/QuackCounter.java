package chapter12;

public class QuackCounter implements Quackable { // QuackCounter is a decorator

	private Quackable duck;
	private static int numberOfQuacks; // Need to count all quacks
	
	public QuackCounter (Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer); // we just delegate both calls to the duck that we're decorating.
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers(); // we just delegate both calls to the duck that we're decorating.
	}

}
