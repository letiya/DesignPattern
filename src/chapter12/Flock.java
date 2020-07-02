package chapter12;

import java.util.ArrayList;
import java.util.Iterator;

// Remember, the composite needs to implement the same interface as the leaf elements. Our leaf elements are Quackables.
public class Flock implements Quackable {

	private ArrayList quackers = new ArrayList(); // Hold the quackables that belong to the flock.
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

}
