import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *  The example is taken from Jon Rowe's first year Software Workshop.
 *  In this class we create a TemperatureComponent which is a JPanel
 *  to display a temperature temp between a minimal (min) and maximal
 *  (max) temperature, initalized to initial. On a ruler.
 *  We will add different parts to it:
 *  - The model
 *  - The views (celsius and fahrenheit)
 *  - The obervers (for celsius and fahrenheit)
 *  @version 2015-11-27
 *  @author Jon Rowe
 */
public class TemperatureComponent extends JPanel {

    /**
     *  Constructor with a temperature as well as dimensions (min and
     *  max) and initial value of the ruler.
     *  @param temp The temperature displayed and changed
     *  @param min The minimal value on the ruler
     *  @param max The maximal value on the ruler
     *  @param initial The initial value on the ruler
     */
    public TemperatureComponent(Temperature temp, int min,
                                int max, int initial){
        super();
		
        // model 
        TemperatureModel model = new TemperatureModel(temp);
		
        // views
        CelsiusView celsius = new CelsiusView(model);
        FahrenheitView fahrenheit = new FahrenheitView(model);
		
        // make views observe model
        model.addObserver(celsius);
        model.addObserver(fahrenheit);
		
        // create control
        JSlider slider = new JSlider(min, max, initial);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing((max - min)/4);
        slider.setPaintLabels(true);
        slider.setLabelTable(slider.createStandardLabels((max-min)/4));
		
        // create listener
        SliderListener listen = new SliderListener(model, slider);
		
        // make listeners listen to controls
        slider.addChangeListener(listen);
		
        // place views and controls on panel
        add(celsius);       // Celsius degrees highest
        add(slider);        // Slider in the middle
        add(fahrenheit);    // Celsius degrees lowest
    }
}
