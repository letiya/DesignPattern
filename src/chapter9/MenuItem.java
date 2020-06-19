package chapter9;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public void print() {
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("   -- " + getDescription());
	}
	
	// Return an iterator that always returns false when hasNext() is called.
	// Note, another option is to return 'null' but then we’d need conditional code in the client to see if null was returned or not.
	public Iterator createIterator() {
		return new NullIterator();
	}
}
