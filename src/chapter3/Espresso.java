package chapter3;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99; // Price of the Espresso = $1.99
	}

}
