/*
 * 
 */
public abstract class Beverage {
	
	String description = "Unkown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	// Cost is implemented in subclasses
	public abstract double cost();
}
