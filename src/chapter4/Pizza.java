package chapter4;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	// Each pizza holds a set of ingredients that are used in its preparation.
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addTopping(String toping) {
		toppings.add(toping);
	}
	
	public abstract void prepare(); // ingredient factory
	
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
