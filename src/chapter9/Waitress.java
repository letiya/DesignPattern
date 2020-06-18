package chapter9;

import java.util.ArrayList;
import java.util.Iterator;;

public class Waitress {
	
	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
	
}
