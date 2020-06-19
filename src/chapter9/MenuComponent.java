package chapter9;

import java.util.Iterator;

// We use abstract class(instead of interface) here so that we can provide default implementations for methods.
public abstract class MenuComponent {
	
	// 1. Composite(Menu) methods.
	public void add(MenuComponent menuComponent) {
		// Because some of these methods only make sense for MenuItems, and some only make sense for Menus, the default implementation is UnsupportedOperationException. 
		// That way, if MenuItem or Menu doesn’t support an operation, they don’t have to do anything, they can just inherit the default implementation
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	// 2. Operation methods(Mainly by MenuItems).
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public Iterator createIterator() {
		throw new UnsupportedOperationException();
	}
	
}
