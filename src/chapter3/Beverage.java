package chapter3;

public abstract class Beverage {
	
	String description = "Unknown Beverage";
	int beverageSize = 0;
	static final int TALL = 0;
	static final int GRANDE = 1;
	static final int VENTI = 2;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public abstract int getSize();
	
	public void setSize(int size) {
		beverageSize = size;
	}

}
