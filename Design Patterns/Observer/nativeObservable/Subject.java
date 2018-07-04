package nativeObservable;
/*
 * Subject interface
 */
public interface Subject {

	/*
	 * Observed to be added or removed is passed as an argument
	 */
	public void registerObserver (Observer o);
	public void removeObserver (Observer o);
	
	/*
	 * Notify all objects when subjects state has changed
	 */
	public void notifyObserver ();

}
