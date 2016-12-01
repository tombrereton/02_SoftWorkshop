import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/**
 *  Class that contains a slider to increase/decrease the circle from
 *  the Circle class.
 *
 *  Example taken from Deitel and Deitel, 8th edition, p.1015-1017 to
 *  illustrate a slider.
 *  @version 2015-11-25
 *  @author Paul Deitel and Harvey Deitel
 */
public class SliderFrame extends JFrame {
    /**
     *  Constructor with no arguments
     */
    public SliderFrame() {
        super("Slider Demo");
        CirclePanel myPanel = new CirclePanel(); // panel to draw a circle
        myPanel.setBackground(Color.WHITE);

        // add a horizontal slider to the panel
        JSlider diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        // The slider should have ticks every 10 pixels
        diameterJSlider.setMajorTickSpacing(10);
        // The ticks are painted on the slider.
        diameterJSlider.setPaintTicks(true);
        // The slider should listen to changes.
        diameterJSlider.addChangeListener(
          //Here an anonymous inner class is used
            new ChangeListener() {
                // Define what should happen when the state is changed
                public void stateChanged(ChangeEvent e) {
                    //Get the value from the slider and set the
                    //diameter accordingly.
                    myPanel.setDiameter(diameterJSlider.getValue());
                }
            }
        );

        //The slider is put on the panel to the bottom of the rectangle.
        add(diameterJSlider, BorderLayout.SOUTH);
        //Add the panel to the JFrame.
        add(myPanel, BorderLayout.CENTER);
    }
}

