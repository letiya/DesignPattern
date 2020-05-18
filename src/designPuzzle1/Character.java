package designPuzzle1;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	public void fight() {
		weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior wb) {
		weapon = wb;
	}
	
	public abstract void display();
}
