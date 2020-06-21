package chapter10;

public class SoldOutState implements State {

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
