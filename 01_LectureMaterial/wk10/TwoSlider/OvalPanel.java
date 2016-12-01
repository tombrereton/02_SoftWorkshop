import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *  Class to paint an ellipse with given diameters, which are initially 10
 *  pixels.
 *
 *  Example adapted from Deitel and Deitel, 8th edition, p.1015-1017 to
 *  illustrate two sliders.
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */
public class OvalPanel extends JPanel {
    /**
     * Two field variables for the horizontal and vertical diameter.
     */
    private int diameterHorizontal = 10;
    private int diameterVertical = 10;

    /**
     *    Override the paintComponent method from the JPanel class.
     *    Then we put a circle on the graphics element g
     *    @param g The graphics component used for painting.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10,10,diameterHorizontal,diameterVertical);
    }

    /**
     *  setter for the horizontal diameter
     *  @param diameterHorizontal The new horizontal diameter, assumed
     *  it is greater equal 0, 10 else.
     */
    public void setDiameterHorizontal(int diameterHorizontal) {
        this.diameterHorizontal =
            (diameterHorizontal >=0 ? diameterHorizontal : 10);
        repaint();
    }

    /**
     *  setter for the vertical diameter
     *  @param diameterVertical The new vertical diameter, assumed
     *  it is greater equal 0, 10 else.
     */
    public void setDiameterVertical(int diameterVertical) {
        this.diameterVertical =
            (diameterVertical >=0 ? diameterVertical : 10);
        repaint();
    }

    /**
     *  The preferred size of the display is defined as a dimension of
     *  200 times 200 pixels.
     *  @return the dimension.
     */
    public Dimension getPreferredSize(){
        return new Dimension(200,200);
    }

    /**
     *  The mimimal size is set to the preferred dimension. This is
     *  used by the layout manager.
     *  @return the dimension.
     */
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}

