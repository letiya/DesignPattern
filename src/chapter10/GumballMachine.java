package chapter10;

public class GumballMachine {
	
	private static final int SOLD_OUT = 0;
	private static final int NO_QUARTER = 1;
	private static final int HAS_QUARTER = 2;
	private static final int SOLD = 3;
	
	private int state = SOLD_OUT;
	private int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	public void getState() {
		System.out.println("\nMighty Gumball, Inc.");
		System.out.println("Java-enabled Standing Gumball Model #2004");
		System.out.println("Inventory: " + count + " gumballs");
		if (count > 0) {
			System.out.println("Machine is waiting for quarter");
		} else {
			System.out.println("Machine is sold out");
		}
		
		switch (state) {
		case HAS_QUARTER:
			System.out.println("Current state is 'HAS QUARTER'");
			break;
		case NO_QUARTER:
			System.out.println("Current state is 'NO QUARTER'");
			break;
		case SOLD_OUT:
			System.out.println("Current state is 'SOLD OUT'");
			break;
		case SOLD:
			System.out.println("Current state is 'SOLD'");
			break;
		}
	}
	
	public void insertQuarter() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("You can’t insert another quarter");
			break;
		case NO_QUARTER:
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
			break;
		case SOLD_OUT:
			System.out.println("You can’t insert a quarter, the machine is sold out");
			break;
		case SOLD:
			System.out.println("Please wait, we’re already giving you a gumball");
			break;
		}
	}
	
	public void ejectQuarter() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("Quarter returned");
			state = NO_QUARTER;
			break;
		case NO_QUARTER:
			System.out.println("You haven’t inserted a quarter");
			break;
		case SOLD_OUT:
			System.out.println("You can’t eject, you haven’t inserted a quarter yet");
			break;
		case SOLD:
			System.out.println("Sorry, you already turned the crank");
			break;
		}
	}
	
	public void turnCrank() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("You turned...");
			state = SOLD;
			dispense();
			break;
		case NO_QUARTER:
			System.out.println("You turned but there’s no quarter");
			break;
		case SOLD_OUT:
			System.out.println("You turned, but there are no gumballs");
			break;
		case SOLD:
			System.out.println("Turning twice doesn’t get you another gumball");
			break;
		}
	}
	
	public void dispense() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("No gumball dispensed");
			break;
		case NO_QUARTER:
			System.out.println("You need to pay first");
			break;
		case SOLD_OUT:
			System.out.println("No gumball dispensed");
			break;
		case SOLD:
			System.out.println("A gumball comes rolling out the slot");
			count--;
			if (count == 0) {
				System.out.println("You got the last one~");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
			break;
		}
	}

}
