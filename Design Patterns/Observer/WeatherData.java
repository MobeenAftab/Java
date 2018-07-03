/*
 * 
 */

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	/*
	 * Array list to hold the Observable to be created 
	 * with the constructor
	 */
	private ArrayList<Observer> observers;
	private float temprature;
	private float humidity;
	private float pressure;

	public WeatherData () {
		observers = new ArrayList<Observer>();
	}
	
	/*
	 * Implement the Subject interface
	 */
	
	/*
	 * (non-Javadoc)
	 * @see Subject#registerObserver(Observer)
	 * When an observer registers add it to the end of the list
	 */
	public void registerObserver (Observer o) {
		observers.add(o);
	}
	
	/*
	 * (non-Javadoc)
	 * @see Subject#removeObserver(Observer)
	 * Remove observer from list
	 */
	public void removeObserver (Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	/*
	 * Notify all the observers about the state. Because they are all
	 * Observers, they all implement the update() method, so we can notify them
	 */
	public void notifyObserver () {
		for (Observer observer : observers) {
			observer.update(temprature, humidity, pressure);
		}
	}
	
	/*
	 * Notify the Observers when we get updated measurements from
	 * the weather station
	 */
	public void measurementsChanged () {
		notifyObserver();
	}
	
	/*
	 * Use this method to test our display elements.
	 */
	public void setMeasurements (float temprature, float humidity, float pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
