package chapter3;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		double cost = 0;
		if (getSize() == Beverage.TALL) {
			cost += 1.89; // House Blend Coffee with size TALL
		} else if (getSize() == Beverage.GRANDE) {
			cost += 2.89; // House Blend Coffee with size GRANDE
		} else if (getSize() == Beverage.VENTI) {
			cost += 3.99; // House Blend Coffee with size VENTI
		}
		return cost; // Price of the House Blend Coffee.
	}
	
	@Override
	public int getSize() {
		return beverageSize;
	}
	
}
