import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *  The class is an implementation of the ActionListener and decreases
 *  the counter by one.
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */
public class DownCounterSep implements ActionListener {
    private ThreeButtonsSep counterObject;
    public DownCounterSep(ThreeButtonsSep counterObject) {
        this.counterObject = counterObject;
    }
    
    /**
     *  On a clicking event, the counter is decreased by one and the
     *  panel is repainted.
     *  @param e The click event.
     */
    public void actionPerformed(ActionEvent e) {
        counterObject.getCounterObject().setCounter(counterObject.getCounterObject().getCounter() - 1);
        System.out.println(counterObject.getCounterObject().getCounter());
        counterObject.repaint();
    }
}
