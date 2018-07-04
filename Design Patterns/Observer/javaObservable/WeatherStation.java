package javaObservable;

/*
 * Main driving class
 * This example uses java built in Observable interface and class package
 */

public class WeatherStation {

	public static void main(String[] args) {
		// Create new WeatherData object
		WeatherData weatherData = new WeatherData();
		
		/*
		 * Create the displays for weatherData
		 * For each setMeasurements call, invoke the following display to output
		 * Because our code does not depend on a specific notification order output
		 * display will appear differently than displays are invoked 
		 */
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay staticDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forcastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		// Simulate new weather measurements
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
