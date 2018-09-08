/**
 * This is a command so it implements the command interface.
 */

package simpleRemote;

public class LightOnCommand implements Command {
	
	Light light;
	
	/**
	 * When execute gets called, this is the light object that is going to be the receiver of the request
	 * @param light: The constructor is passed the specific light that this command is going to control
	 * and stashes it in the light instance variable
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
}
