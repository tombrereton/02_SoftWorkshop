import javax.swing.JFrame;
/**
 *  Class with the main method to run the TwoSlider application.
 * 
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */
public class TwoSliderDemo{
    /*
     *  main method to generate an object and make it visible.
     */
    public static void main(String[] args) {
        //        TwoSliderFrame sliderFrame = new TwoSliderFrame();
        TwoSliderFrameFunction sliderFrame = new TwoSliderFrameFunction();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sliderFrame.setSize(220,270);
        sliderFrame.setVisible(true);
    }
}
