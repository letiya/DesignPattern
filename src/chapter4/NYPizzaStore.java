package chapter4;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); // Define pizza with local style
		
		switch (type) {
			case "cheese":
				pizza = new CheesePizza(ingredientFactory);
				pizza.setName("New York Style Cheese Pizza");
				break;
			case "veggie":
				pizza = new VeggiePizza(ingredientFactory);
				pizza.setName("New York Style Veggie Pizza");
				break;
			default:
				pizza = null;
		}
		return pizza;
	}
	
}
