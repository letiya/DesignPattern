package chapter11;

public class WinnerState implements State {
	
	private transient GumballMachine gumballMachine; // 'transient' keyword -> This tells the JVM not to serialize this field. Note that this can be slightly dangerous if you try to access this field once its been serialized and transferred.
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we’re already giving you a gumball"); // An inappropriate action for this state.
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank"); // An inappropriate action for this state.
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn’t get you another gumball"); // An inappropriate action for this state.
	}

	@Override
	public void dispense() {
		System.out.println("YOU’RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall(); // Release the first gumball
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall(); // Release the second gumball
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
