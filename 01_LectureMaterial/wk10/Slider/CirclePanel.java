import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *  Class to paint a circle with given diameter, which is initially 10
 *  pixels.
 *
 *  Example taken from Deitel and Deitel, 8th edition, p.1015-1017 to
 *  illustrate a slider.
 *  @version 2015-11-25
 *  @author Paul Deitel and Harvey Deitel
 */
public class CirclePanel extends JPanel {

    private int diameter = 10;

    /**
     *    Override the paintComponent method from the JPanel class.
     *    Then we put a circle on the graphics element g
     *    @param g The graphics component used for painting.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10,10,diameter,diameter);
    }

    /**
     *  setter for the diameter
     *  @param diameter The new diameter, assumed it is greater equal
     *  0, 10 else.
     */
        public void setDiameter(int diameter) {
        this.diameter = (diameter >=0 ? diameter : 10);
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
