package chapter11;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
	
	public MatchMakingTestDrive() {
//		initializeDatabase();
	}
	
	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can¡¦t set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can¡¦t set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}
	
	private PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
	private PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}
	
	private PersonBean getPersonFromDatabase(String name) {
		PersonBean person = new PersonBeanImpl();
		person.setName(name);
		person.setGender("Female");
		person.setInterests("Reading");
		return person;
	}

}
