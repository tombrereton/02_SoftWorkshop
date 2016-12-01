import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *  Taken from the 4th edition of "Absolute Java" by Walter Savitch,
 *  p.971. The EndingListener implements the ActionListener interface
 *  by giving an implementation for actionPerformed, that is, it tells
 *  the program what should happen when the button (to which it is
 *  linked) is clicked. Here the system should exit normally
 *  (terminate normally, 0 stands for normally, all other values for n
 *  would tell that something went wrong in System.exit(n)).
 *  @version 2015-11-24
 *  @author Walter Savitch
 *
 */
public class EndingListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
