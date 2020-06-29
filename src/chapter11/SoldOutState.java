package chapter11;

public class SoldOutState implements State {
	
	private transient GumballMachine gumballMachine; // 'transient' keyword -> This tells the JVM not to serialize this field. Note that this can be slightly dangerous if you try to access this field once its been serialized and transferred.
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can’t insert a quarter, the machine is sold out"); // An inappropriate action for this state.
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can’t eject, you haven’t inserted a quarter yet"); // An inappropriate action for this state.
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs"); // An inappropriate action for this state.
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
