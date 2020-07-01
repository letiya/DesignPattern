package chapter11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	
	private PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) { // Pass the real subject in the constructor
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				// Do not allow the users to rate themselves. Hence -> throws an exception
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (InvocationTargetException e) {
			// This will happen if the real subject throws an exception
			e.printStackTrace();
		}
		return null;
	}

}
