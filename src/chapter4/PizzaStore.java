package chapter4;

public class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		switch (type) {
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
			default:
				pizza = null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
