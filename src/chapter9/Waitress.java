package chapter9;

import java.util.Iterator;;

public class Waitress {
	
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		System.out.println("MENU\n------------\n----BREAKFAST----");
		printMenu(pancakeIterator);
		
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("\n----LUNCH----");
		printMenu(dinerIterator);
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
