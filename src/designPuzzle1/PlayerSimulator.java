package designPuzzle1;

public class PlayerSimulator {
	
	public static void main(String[] args) {
		Character king = new King();
		king.display();
		king.setWeapon(new BowAndArrowBehavior());
		king.fight();
		
		Character troll = new Troll();
		troll.display();
		troll.fight();
	}
	
}
