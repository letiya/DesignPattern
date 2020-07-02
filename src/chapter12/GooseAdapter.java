package chapter12;

public class GooseAdapter implements Quackable { // Adapter implements a target(client) interface.
	
	private Goose goose;
	
	public GooseAdapter(Goose goose) { // The constructor keeps a goose(adaptee) reference.
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}

}
