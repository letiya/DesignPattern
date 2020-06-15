package chapter9;

import java.util.ArrayList;
import java.util.Iterator;;

public class Waitress {
	
	private ArrayList menus;
	
	public Waitress(ArrayList menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = (Menu) menuIterator.next();
			System.out.println("=======================Print menu=======================");
			printMenu(menu.createIterator());
		}
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice()+ " ");
			System.out.println(menuItem.getDescription() + " ");
		}
	}
	
}
