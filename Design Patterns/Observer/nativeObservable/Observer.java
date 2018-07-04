package nativeObservable;
/*
 * Observer Interface all weather components (observers) implement
 * Common interface for all subject dependencies to communicate
 */
public interface Observer {

	/*
	 * Pass state values the Observers get from the subject when a weather
	 * measurement changes
	 */
	public void update (float temprature, float humidity, float pressure);
}
