import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

/**
 *   Text view of temperature in Celsius
 *   @version 2015-11-27
 *   @author Jon Rowe
 */
public class CelsiusView extends JLabel implements Observer {
    private TemperatureModel model;
	
    /**
     *  Initialise view with model
     *  @param model the underlying temperature model
     */
    public CelsiusView(TemperatureModel model) {
        super();
        this.model = model;

        /* The text is converted so that only one digit after the
         * decimal point is presented. Alternatively use String.format.
         * Note, we need to set the text in the constructor AND in the
         * update method so that it is presented initially AND when it
         * is changed.
         */
        double value = Math.floor(10 * model.getCelsius())/10;
        setText(value + " Celsius");
    }

    /**
     *  The method describes the observable update of the celsius
     *  values.
     *  @param obs The observable object
     *  @param obj The object passed to the notifyObservers method.
     */
    public void update(Observable obs, Object obj) {
        double value = Math.floor(10 * model.getCelsius())/10;
        setText(value + " Celsius");
    }
}
