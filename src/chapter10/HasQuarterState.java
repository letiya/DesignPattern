package chapter10;

public class HasQuarterState implements State {

	@Override
	public void insertQuarter() {
		System.out.println("You can’t insert another quarter"); // An inappropriate action for this state.
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed"); // An inappropriate action for this state.
	}

}
