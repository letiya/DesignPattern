package chapter9;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	
	private Stack stack = new Stack();

	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (iterator.hasNext()) {
				return true;
			} else {
				stack.pop();
				return hasNext();
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next(); // component could be MenuClass or MenuItem.
			if (component instanceof MenuClass) { // If it is a composite -> It could contain MenuClass + MenuItem. Hence, push Iterator of this composite to stack!
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException(); // We’re not supporting remove, just traversal.
	}
	
}
