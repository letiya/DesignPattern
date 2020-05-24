package chapter4;

public class PizzaStore {
	
	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = new SimplePizzaFactory();
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = SimplePizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

}
