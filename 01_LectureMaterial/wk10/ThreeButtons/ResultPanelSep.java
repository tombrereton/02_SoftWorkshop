import java.awt.*;
import javax.swing.JPanel;

/**
 *  The class represents a panel that displays the current value of
 *  the counter.
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */
public class ResultPanelSep extends JPanel {
    private Counter counter;
    public ResultPanelSep(Counter counter) {
        this.counter = counter;
    }
    
    /**
     *    Override the paintComponent method from the JPanel class.
     *    Then we write the counter on the graphics element g
     *    @param g The graphics component used for painting.
     */
    @Override
    public void paintComponent(Graphics g){
        Font myfont = new Font("Dialog",1,18);
        setFont(myfont);
        g.drawString("counter: " + counter.getCounter(), 30, 20);
    }
}
