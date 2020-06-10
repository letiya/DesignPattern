package chapter9;

import java.util.ArrayList;

public class Waitress {
	
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem) breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice()+ " ");
			System.out.println(menuItem.getDescription() + " ");
		}
		
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice()+ " ");
			System.out.println(menuItem.getDescription() + " ");
		}
		
	}
	
}
