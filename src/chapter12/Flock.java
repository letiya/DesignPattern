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

	@Override
	public void registerObserver(Observer observer) {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			// We iterate through all the Quackables in the Flock and delegate the call to each Quackable. If the Quackable is another Flock, it will do the same.
			Quackable quacker = (Quackable) iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// Each Quackable does its own notification, so Flock doesn't have to worry about it. 
		// This happens when Flock delegates quack() to each Quackable in the Flock.
	}

}
