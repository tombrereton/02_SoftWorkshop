import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/**
 *  Class that contains two sliders to increase/decrease the ellipse from
 *  the OvalPanel class.
 *
 *  Example adapted from Deitel and Deitel, 8th edition, p.1015-1017 to
 *  illustrate two sliders.
 *  @version 2016-11-28
 *  @author Manfred Kerber
 */
public class TwoSliderFrameFunction extends JFrame {

    public TwoSliderFrameFunction() {
        super("Slider Demo");
        OvalPanel myPanel = new OvalPanel(); // panel to draw an ellipse
        myPanel.setBackground(Color.WHITE);

        // add a horizontal slider to the panel
        JSlider horizontalJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        // The slider should have ticks every 10 pixels
        horizontalJSlider.setMajorTickSpacing(10);
        // The ticks are painted on the slider.
        horizontalJSlider.setPaintTicks(true);
        // The slider should listen to changes.
        horizontalJSlider.addChangeListener(
          //Defined as an anonymous function
           e -> {myPanel.setDiameterHorizontal(horizontalJSlider.getValue());}
        );
        //The slider is put on the panel to the bottom of the rectangle.
        add(horizontalJSlider, BorderLayout.SOUTH);

        // add a vertical slider to the panel
        JSlider verticalJSlider = new JSlider(SwingConstants.VERTICAL, 0, 200, 10);
        // The slider should have ticks every 10 pixels
        verticalJSlider.setMajorTickSpacing(10);
        // The ticks are painted on the slider.
        verticalJSlider.setPaintTicks(true);
        // slider top down, rather than bottom up.
        verticalJSlider.setInverted(true); 
        // The slider should listen to changes.
        verticalJSlider.addChangeListener(
          //Here an anonymous inner class is used
            new ChangeListener() {
                // Define what should happen when the state is changed
                public void stateChanged(ChangeEvent e) {
                    //Get the value from the slider and set the
                    //diameter accordingly.
                    myPanel.setDiameterVertical(verticalJSlider.getValue());
                }
            }
        );
        //The slider is put on the panel to the left of the rectangle.
        add(verticalJSlider, BorderLayout.WEST);
        //Add the panel to the JFrame.
        add(myPanel, BorderLayout.CENTER);
    }
}

