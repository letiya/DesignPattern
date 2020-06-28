package chapter11;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		try {
			// MyRemote -> The client always uses the remote	interface as the type of the service.
			// 127.0.0.1 -> The host name or IP address where the service is running.
			// RemoteHello -> name that the service was registered under.
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHello();
			System.out.println(s);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
