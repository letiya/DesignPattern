package chapter3;

// we need to be interchangeable with a Beverage, so we extend the Beverage class.
public abstract class CondimentDecorator extends Beverage {
	
	public abstract String getDescription();

}
