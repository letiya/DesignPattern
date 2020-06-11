package chapter9;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	
	private MenuItem[] items;
	private int position; // Insert new item to 'this position'.
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items[position++];
	}
	
	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < items.length - 1; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}

}