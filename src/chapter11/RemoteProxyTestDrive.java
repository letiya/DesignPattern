package chapter11;

import java.rmi.Naming;

public class RemoteProxyTestDrive {

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl(); // Make the remote object.
			Naming.rebind("RemoteHello", service); // then 'bind' it to the rmiregistery using the static Naming.rebind(). Clients will use the name, "RemoteHello" to look it up in the RMI registry.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
