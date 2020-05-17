package chapter1;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyWithNoWings();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I am a Model Duck.");
	}
}
