package Duck;
/*
 * Flying behaviour implementation for ducks that dont fly
 */
public class FlyNoWay implements FlyBehaviour {
	
	public void fly() {
		System.out.println("I cant fly");
	}

}
