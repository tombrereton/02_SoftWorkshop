import javax.swing.event.*;
import javax.swing.JSlider;

/**
 *   The SliderListener takes values between the minimal value and the
 *   maximal value of the slider and add this value to the model by
 *   setting the corresponding value to the temperature in the model.
 *   When the slider is moved the value is updated in the stateChanged
 *   method.
 *   @version 2015-11-27
 *   @author Jon Rowe
 */

public class SliderListener implements ChangeListener {

    private TemperatureModel model;
    private JSlider slider;

    /**
     *   Constructor for the SliderListener
     *   @param model The model representing the temperature.
     *   @param slider The slider that provides the temperature values
     *   for the model.
     */
    public SliderListener(TemperatureModel model, JSlider slider) {
        this.model = model;
        this.slider = slider;
    }

    /**
     *  The temperature value is updated to the value that the slider provides.
     *  @param e A change event of which no use is made in the method.
     */
    public void stateChanged(ChangeEvent e){
        int value = slider.getValue();
        model.setCelsius(value);
    }
}
