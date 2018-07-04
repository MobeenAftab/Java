/*
 * WeatherData class that implements Subject interface
 */

package javaObservable;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	
	/*
	 * Remove Observer list and methods as they will now be handled by
	 * Java's built in methods for implementing observer patterns
	 */
	
	private float temprature;
	private float humidity;
	private float pressure;

	public WeatherData () {	}
	
	
	/*
	 * Notify the Observers when we get updated measurements from
	 * the weather station
	 */
	public void measurementsChanged () {
		// Indicate that state has changed before calling notifyObservers
		setChanged();
		
		/*
		 * By not sending a data object with call means we are using 
		 * the PULL model
		 */
		notifyObservers();
	}
	
	/*
	 * Use this method to test our display elements.
	 */
	public void setMeasurements (float temprature, float humidity, float pressure) {
		this.setTemprature(temprature);
		this.setHumidity(humidity);
		this.setPressure(pressure);
		measurementsChanged();
	}


	/*
	 * Getter methods so Observers can get the WeatherData objects state
	 */
	
	/**
	 * @return the temperature
	 */
	public float getTemprature() {
		return temprature;
	}


	/**
	 * @param temprature the temperature to set
	 */
	public void setTemprature(float temprature) {
		this.temprature = temprature;
	}


	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}


	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}


	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}


	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
