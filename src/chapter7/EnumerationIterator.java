package chapter7;

import java.util.Enumeration;
import java.util.Iterator;

// Adapting Enumeration to Iterator. It has to look like an Iterator.
public class EnumerationIterator implements Iterator {

	Enumeration enumerator;
	
	public EnumerationIterator(Enumeration enumerator) {
		this.enumerator = enumerator;
	}
	
	@Override
	public boolean hasNext() {
		return enumerator.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumerator.nextElement();
	}
	
	public void remove() {
		System.out.println("Enumeration does not have remove()");
		throw new UnsupportedOperationException();
	}

}
