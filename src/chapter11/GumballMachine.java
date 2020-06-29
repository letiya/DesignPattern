package chapter11;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Subclass the UnicastRemoteObject; this gives it the ability to act as a remote service.
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	
	private State state;
	private int count = 0;
	
	private String location;
	
	public GumballMachine(String location, int numberGumballs) throws RemoteException { // The constructor needs to throw a remote exception because the superclass does.
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (count > 0) {
			state = noQuarterState;
		}
		this.location = location;
	}
	
	public void getInfo() {
		System.out.println("\nMighty Gumball, Inc.");
		System.out.println("Java-enabled Standing Gumball Model #2004");
		System.out.println("Inventory: " + count + " gumballs");
		if (count > 0) {
			System.out.println("Machine is waiting for quarter");
		} else {
			System.out.println("Machine is sold out");
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter(); // Delegate to the state class
	}
	
	public void ejectQuarter() {
		state.ejectQuarter(); // Delegate to the state class
	}
	
	public void turnCrank() {
		state.turnCrank(); // Delegate to the state class
		state.dispense(); // Delegate to the state class
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		if (count != 0) {
			System.out.println("A gumball comes rolling out the slot...");
			count--;
		}
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public String getLocation() throws RemoteException {
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		return state;
	}
	
}
