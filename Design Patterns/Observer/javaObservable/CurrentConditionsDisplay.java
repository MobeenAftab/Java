/*
 * Display implements Observer so it can get changes from the WeatherData object
 * Implements DisplayElement because Java API is going to require all display elements to
 * implement this interface
 */

package javaObservable;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	Observable observer;
	private float temperature;
	private float humidity;
	
	/*
	 * The constructor is passed the weatherData object (the subject)
	 * and we use it to register the display as an observer
	 */
	
	/*
	 * Constructor takes in an observable and use this to add the current conditions
	 * object as an Observer
	 */
	public CurrentConditionsDisplay (Observable observer) {
		this.observer = observer;
		observer.addObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * @see DisplayElement#display()
	 * The display method just prints out the most recent temp and humidity
	 */
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and "
				+ humidity + "% humidity");
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 * Update method now takes both an Observable and optional data argument
	 */
	public void update(Observable obs, Object arg) {
		// Check if obs is of type WeatherData and update its values
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemprature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
