import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *  The first example is taken from the 4th edition of "Absolute Java"
 *  by Walter Savitch, p.971ff
 *  
 *  @version 2015-11-24
 *  @author Walter Savitch
 */

public class FirstWindow extends JFrame{
    /**
     *  The frame size is set by final static variables.
     */
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public FirstWindow() {
        super();
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("First Window Class");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        /*  We add a button with a label. Note that as such the button
         *  does not do anything, but that it is necessary to add an
         *  ActionListener. This is done in the file
         *  EndingListener.java
         */
        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener());
        this.add(endButton);
    }
}
