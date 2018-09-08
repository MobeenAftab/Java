package simpleRemote;

public class RemoteControlTest {

	public static void main(String[] args) {
		/**
		 * This remote is our invoker; it will be passed a command object that can be used
		 * to make requests
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		/**
		 * Now create a light object that will be the receiver of the request
		 */
		Light light = new Light();
		
		/**
		 * Now create a GarageDoor object that will be the receiver of the request
		 */
		GarageDoor garageDoor = new GarageDoor();
		
		/**
		 * Here, create a command and pass the receiver to it
		 */
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		// Pass the command to the invoker
		remote.setCommand(lightOn);
		// Simulate the button being pressed
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
		
	}

}
