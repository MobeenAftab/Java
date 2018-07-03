package Duck;
/*
 * New type of duck extends and inherits from Duck superclass
 */
public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a real mallard duck");
	}
	
	/*
	 * MallardDuck inherits the Behaviour instances variables from class Duck
	 * When performX is called responsibility for quack and fly is delegated 
	 * to their objects and returns the appropriate Behaviour
	 * Behaviour class handles themselves 
	 */
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
}
