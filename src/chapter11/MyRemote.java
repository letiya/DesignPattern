package chapter11;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 'extends Remote' - This tells us that the interface is going to be used to support remote calls.
public interface MyRemote extends Remote {

	// All methods throw a RemoteException!
	// Be sure arguments and return values are primitive or Serializable.
	public String sayHello() throws RemoteException; // 'throws RemoteException' -> Every remote method call is	considered risky (Because it involves networking).
	
}
