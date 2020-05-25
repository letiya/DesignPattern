package chapter4;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	
	public void addTopping(String toping) {
		toppings.add(toping);
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough..." + dough);
		System.out.println("Adding sauce..." + sauce);
		if (toppings.size() > 0) {
			System.out.print("Adding toppings...");
			for (String topping : toppings) {
				System.out.print(" " + topping);
			}
			System.out.println("");
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
}
