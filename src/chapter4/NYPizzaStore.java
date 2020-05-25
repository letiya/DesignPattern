package chapter4;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		switch (type) {
			case "cheese":
				pizza = new NYStyleCheesePizza(); // Define pizza with local style here. 
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
