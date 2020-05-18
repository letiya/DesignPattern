package designPuzzle1;

public class Troll extends Character {

	public Troll() {
		weapon = new AxeBehavior();
	}

	@Override
	public void display() {
		System.out.println("This is the troll...");
	}

}
