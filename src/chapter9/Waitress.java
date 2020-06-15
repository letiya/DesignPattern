package chapter9;

import java.util.Iterator;;

public class Waitress {
	
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu cafeMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		System.out.println("MENU\n------------\n----BREAKFAST----");
		printMenu(pancakeIterator);
		
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("\n----LUNCH----");
		printMenu(dinerIterator);
		
		Iterator cafeIterator = cafeMenu.createIterator();
		System.out.println("\n----DINNER----");
		printMenu(cafeIterator);
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
