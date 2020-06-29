package chapter11;

import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		try {
			int count = Integer.parseInt(args[1]);
			GumballMachineRemote gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine); // We also add the call to Naming.rebind, which publishes the GumballMachine stub under the name gumballmachine.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
