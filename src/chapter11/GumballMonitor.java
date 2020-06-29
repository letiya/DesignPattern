package chapter11;

import java.rmi.*;

public class GumballMonitor {
	
	private GumballMachineRemote machine; // Rely on the remote interface rather than the concrete GumballMachine class.
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount() + " gumballs");
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
}
