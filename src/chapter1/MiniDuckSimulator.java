package chapter1;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("");
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		System.out.println("Default behavior: ");
		modelDuck.performFly();
		modelDuck.performQuack();
		
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		System.out.println("Set up fly behavior...");
		modelDuck.performFly();
		modelDuck.performQuack();
	}

}
