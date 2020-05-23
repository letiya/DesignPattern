package chapter3;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost(); // wrapped beverage
		if (getSize() == Beverage.TALL) {
			cost += 0.1; // Mocha with size TALL
		} else if (getSize() == Beverage.GRANDE) {
			cost += 0.15; // Mocha with size GRANDE
		} else if (getSize() == Beverage.VENTI) {
			cost += 0.2; // Mocha with size VENTI
		}
		return cost;
	}

	@Override
	public int getSize() {
		return beverage.getSize();
	}

}
