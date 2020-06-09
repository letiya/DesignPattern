package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}
	
	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk and sugar with your coffee (y/n)? (Program is waiting for an answer...)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO error trying to read your answer");
		}
		return answer == null ? "no" : answer;
	}

}
