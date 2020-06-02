package chapter7;

// Need to implement the interface of the type you are adapting to. This is the interface your client expects to see.
public class TurkeyAdapter implements Duck {
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) { // Need to get a reference of the object we are adapting.
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		// Although duck and turkey both fly, turkey flies in short spurts. Hence, to fly the same distance, turkey needs to fly 5 times to make up for it.
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
