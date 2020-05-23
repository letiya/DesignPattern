package chapter3;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		double cost = 0;
		if (getSize() == Beverage.TALL) {
			cost += 1.99; // Espresso with size TALL
		} else if (getSize() == Beverage.GRANDE) {
			cost += 2.99; // Espresso with size GRANDE
		} else if (getSize() == Beverage.VENTI) {
			cost += 3.99; // Espresso with size VENTI
		}
		return cost; // Price of the Espresso.
	}

	@Override
	public int getSize() {
		return beverageSize;
	}

}
