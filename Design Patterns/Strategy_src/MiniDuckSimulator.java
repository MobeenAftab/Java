/*
 * Main driver class for Duck class
 * 
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		// Polymorphically create new Duck mallard of type MallardDuck 
		Duck mallard = new MallardDuck();
		
		/*
		 * Call MallardDucks inherited perform methods, which then delegates to
		 * the object's behaviour
		 */
		mallard.performQuack();
		mallard.performFly();
		
		// instance of Duck subclass ModelDuck
		Duck model = new ModelDuck();
		
		/*
		 * Set models flyBehaviour object using the ModelDuck constructor and
		 * then dynamically change its behaviour with setter method.
		 */
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
