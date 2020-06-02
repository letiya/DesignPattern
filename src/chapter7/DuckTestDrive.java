package chapter7;

public class DuckTestDrive {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey); // Turkey -> Duck
		
		System.out.println("The turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("The duck says...");
		mallardDuck.quack();
		mallardDuck.fly();
		
		System.out.println("The turkeyAdapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}

}
