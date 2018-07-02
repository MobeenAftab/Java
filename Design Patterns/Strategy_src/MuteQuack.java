/*
 * Quacking behaviour implementation for ducks that do not quack
 */
public class MuteQuack implements QuackBehaviour {

	public void quack() {
		System.out.println("<< Silence >>");
	}
}
