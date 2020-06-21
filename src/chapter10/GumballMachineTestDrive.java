package chapter10;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		gumballMachine.getInfo();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.getInfo();
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		gumballMachine.getInfo();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		gumballMachine.getInfo();
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.getInfo();
	}

}
