/*
 * Mocha is a decorator.
 * Instantiate Mocha with a reference to beverage (1) using an instance variable reference to beverage 
 * and (2) set the instance variable to the object we are wrapping to the decorators constructor. 
 */
public class Mocha extends CondimentsDecorator {
	
	// (1)
	Beverage beverage;

	// (2)
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// Append Condiment name to description of beverage
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return beverage.cost() + .20;
	}
}
