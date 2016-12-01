import javax.swing.JFrame;
/** 
 *  Class with the main method to demonstrate the slider application. 
 *
 *  Example taken from Deitel and Deitel, 8th edition, p.1017 to
 *  illustrate a slider.
 *  @version 2015-11-25
 *  @author Paul Deitel and Harvey Deitel
 */
public class SliderDemo{
    /*
     *  Main method to define a frame with a slider and make it visible.
     */
    public static void main(String[] args) {
        SliderFrame sliderFrame = new SliderFrame();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sliderFrame.setSize(220,270);
        sliderFrame.setVisible(true);
    }
}
