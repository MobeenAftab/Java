package starbuzz;

public class Soy extends CondimentsDecorator {
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// Append Condiment name to description of beverage
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return beverage.cost() + .15;
	}

}
