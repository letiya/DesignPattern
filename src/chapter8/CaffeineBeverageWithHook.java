package chapter8;

public abstract class CaffeineBeverageWithHook {
	
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	// Abstract operation.
	public abstract void brew();
	
	// Abstract operation.
	public abstract void addCondiments();
	
	// Concrete operation.
	private void boilWater() {
		System.out.println("Boiling water");
	}
	
	// Concrete operation.
	private void pourInCup() {
		System.out.println("Pouling into cup");
	}
	
	// This is a "hook" because the subclass can override this method but doesn't have to.
	public boolean customerWantsCondiments() {
		return true;
	}
	
}
