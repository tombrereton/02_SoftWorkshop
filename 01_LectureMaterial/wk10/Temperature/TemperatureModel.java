import java.util.Observable;

/**
 *  Model of temperature class
 *  Enhance the Temperature class by obervables.
 *  @version 2015-11-27
 *  @author Jon Rowe
 */


public class TemperatureModel extends Observable {
    private Temperature temp;
	
    public TemperatureModel(Temperature temp) {
        super();
        this.temp = temp;
    }
	
    /**
     *  Get the temperature in Celsius
     *  @return temperature in Celsius
     */
    public double getCelsius() {
        return temp.getCelsius();
    }
	
	
    /**
     *  Get the temperature in Fahrenheit
     *  @return temperature in Fahrenheit
     */
    public double getFahrenheit() {
        return temp.getFahrenheit();
    }
	
    /**
     *  Change the temperature in Celsius
     *  @param celsius The new temperature in Celsius
     */
    public void setCelsius(double celsius) {
        temp.setCelsius(celsius);
        setChanged();
        notifyObservers();
    }
	
    /**
     *  Change the temperature in Fahrenheit
     *  @param fahrenheit The new temperature in Fahrenheit
     */
    public void setFahrenheit(double fahrenheit) {
        temp.setFahrenheit(fahrenheit);
        setChanged();
        notifyObservers();
    }
}
