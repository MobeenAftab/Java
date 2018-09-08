package simpleRemote;

public class SimpleRemoteControl {

	// One slot to hold command, which will control one device
	Command slot;
	
	/**
	 * 
	 */
	public SimpleRemoteControl() {
		
	}
	
	/**
	 * Method for setting the command the slot is going to control.
	 * @param command
	 */
	public void setCommand(Command command) {
		slot = command;
	}
	
	/**
	 * This method is called when the button is pressed.
	 * Take the current command bound to the slot and call its execute();
	 */
	public void buttonWasPressed() {
		slot.execute();
	}
}
