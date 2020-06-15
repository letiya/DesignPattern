package chapter9;

import java.util.ArrayList;

public class MenuTestDrive {

	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		
		ArrayList menus = new ArrayList();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);
		
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}

}
