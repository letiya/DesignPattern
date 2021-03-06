package chapter3;

public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage.setSize(Beverage.TALL);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2.setSize(Beverage.VENTI);
		// Make a double mocha.
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		// Add a whip
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
	}

}
