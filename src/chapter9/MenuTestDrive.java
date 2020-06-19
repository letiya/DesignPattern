package chapter9;

public class MenuTestDrive {

	public static void main(String[] args) {
		// Version 1
//		Menu pancakeHouseMenu = new PancakeHouseMenu();
//		Menu dinerMenu = new DinerMenu();
//		Menu cafeMenu = new CafeMenu();
//		
//		ArrayList menus = new ArrayList();
//		menus.add(pancakeHouseMenu);
//		menus.add(dinerMenu);
//		menus.add(cafeMenu);
//		
//		Waitress waitress = new Waitress(menus);
//		waitress.printMenu();
		
		// Version 2. Add a desert menu to diner menu
		MenuComponent pancakeHouseMenu = new MenuClass("PANCAKE HOUSE MENU", "Breakfast");
		pancakeHouseMenu.add(new MenuItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
		
		MenuComponent dinerMenu = new MenuClass("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new MenuClass("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new MenuClass("DESSERT MENU", "Dessert of course!");
		
		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
		
		MenuComponent allMenus = new MenuClass("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenus);
//		waitress.printMenu();
		waitress.printVegetarianMenu();
	}

}
