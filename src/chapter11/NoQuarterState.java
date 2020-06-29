package chapter11;

public class NoQuarterState implements State {
	
	private transient GumballMachine gumballMachine; // 'transient' keyword -> This tells the JVM not to serialize this field. Note that this can be slightly dangerous if you try to access this field once its been serialized and transferred.
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven’t inserted a quarter"); // An inappropriate action for this state.
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there’s no quarter"); // An inappropriate action for this state.
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first"); // An inappropriate action for this state.
	}

}
