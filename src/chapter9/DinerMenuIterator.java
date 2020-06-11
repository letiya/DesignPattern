package chapter9;

public class DinerMenuIterator implements Iterator {
	
	private MenuItem[] items;
	private int position;
	
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

}