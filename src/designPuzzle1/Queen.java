package designPuzzle1;

public class Queen extends Character {
	
	public Queen() {
		weapon = new KnifeBehavior();
	}

	@Override
	public void display() {
		System.out.println("This is the queen...");
	}

}
