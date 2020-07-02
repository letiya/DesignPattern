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

}
