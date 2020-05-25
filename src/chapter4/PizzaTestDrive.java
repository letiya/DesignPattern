package chapter4;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza cheesePizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("");
		Pizza veggiePizza = nyPizzaStore.orderPizza("veggie");
	}

}
