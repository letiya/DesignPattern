package chapter10;

public class NoQuarterState implements State {

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
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
