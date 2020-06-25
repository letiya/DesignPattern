package chapter11;

public class SoldState implements State {
	
	private GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
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
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
