package chapter11;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// In order to work as a remote service object, your object needs some functionality related to ‘being remote’. The simplest way is to extend UnicastRemoteObject
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	
	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}
	
}