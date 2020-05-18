package designPuzzle1;

public class King extends Character {
	
	public King() {
		weapon = new BowAndArrowBehavior();
	}

	@Override
	public void display() {
		System.out.println("This is the king...");
	}

}
