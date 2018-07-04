package nativeObservable;
/*
 * Display implements Observer so it can get changes from the WeatherData object
 * Implements DisplayElement because our API is going to require all display elements to
 * implement this interface
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/*
	 * The constructor is passed the weatherData object (the subject)
	 * and we use it to register the display as an observer
	 */
	public CurrentConditionsDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
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
	 * @see Observer#update(float, float, float)
	 * When update is called we save the temp and humidity and call display
	 */
	public void update(float temprature, float humidity, float pressure) {
		this.temperature = temprature;
		this.humidity = humidity;
		display();
	}

}
