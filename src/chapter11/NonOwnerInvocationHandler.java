package chapter11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	
	private PersonBean person;
	
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				// Do not allow the other users to set interests for the user itself. Hence -> throws an exception
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			// This will happen if the real subject throws an exception
			e.printStackTrace();
		}
		return null;
	}

}
