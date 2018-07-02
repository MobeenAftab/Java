/*
 * New type of duck extends and inherits from Duck superclass
 */
public class ModelDuck extends Duck{
	
	/*
	 * Constructor utilises polymorphism to set ModelDuck behaviours
	 */
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}

}
