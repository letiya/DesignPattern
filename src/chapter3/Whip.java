package chapter3;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double cost = beverage.cost(); // wrapped beverage
		if (getSize() == Beverage.TALL) {
			cost += 0.1; // Whip with size TALL
		} else if (getSize() == Beverage.GRANDE) {
			cost += 0.15; // Whip with size GRANDE
		} else if (getSize() == Beverage.VENTI) {
			cost += 0.2; // Whip with size VENTI
		}
		return cost;
	}
	
	@Override
	public int getSize() {
		return beverage.getSize();
	}

}
