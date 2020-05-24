package chapter4;

public class SimplePizzaFactory {
	
	public static Pizza createPizza(String type) {
		Pizza pizza;
		switch (type) {
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
				break;
			default:
				pizza = null;
		}
		return pizza;
	}

}
