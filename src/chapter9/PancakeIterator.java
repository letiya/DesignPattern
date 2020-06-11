package chapter9;

import java.util.ArrayList;

public class PancakeIterator implements Iterator {
	
	private ArrayList items;
	private int position;
	
	public PancakeIterator(ArrayList items) {
		this.items = items;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		return items.get(position++);
	}

}
