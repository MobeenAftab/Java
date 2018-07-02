/* 
 * Duck superclass that other duck type classes will
 * extend from. Behaviour Interface
 */
public abstract class Duck {

	/*
	 * Behaviour variables are declared as the behaviour interface type
	 * Instance variables hold a reference to a specific behaviour at runtime
	 * Inherited by all subclasses and used to delegate Behaviour.
	 */
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	/*
	 * Each Duck has a reference to something that implements the Behaviour Interfaces
	 * Duck object delegates that behaviour to the object referenced by Interface
	 * Delegate the behaviour for each subclass to select their appropriate behaviour
	 */
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	/*
	 * Setter methods to change behaviour dynamically on the fly
	 */
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

}
