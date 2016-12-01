import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

/**
 *  
 *  We want to add in this class to the previous class with one single
 *  button, which just exists the application. Here we want to
 *  implement a counter which is increased by one when clicking on one
 *  button and decreased by one when clicking on a second. With the
 *  third button we can exit the application.
 * 
 *  In order to do that we put a bigPanel on the JFrame and four
 *  smaller panels on the bigPanel, one for increasing (upPanel), one
 *  for decreasing (downPanel), one for exiting (endPanel), and one
 *  for displaying the current value of the counter.
 *  In order to do so we make use of the GridLayout class.
 *
 *  In this variant we create separate classes for the four different
 *  buttons and pass on the corresponding object explicitly.  We have
 *  also a separate class for the Counter, which represents the actual
 *  model.
 * 
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */

public class ThreeButtonsSep extends JFrame{
    /**
     *  The frame size is set by final static variables.
     */
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private Counter counterObject; // the one and only field variable

    /**
     *  Constructor with counterObject as argument
     *  @param counterObject A counter object is passed on, which is
     *  manipulated by the up/down buttons.
     */
    public ThreeButtonsSep(Counter counterObject) {
        super();
        this.counterObject = counterObject;

        this.setSize(WIDTH, HEIGHT);
        this.setTitle("First Window Class");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // the panel to be put on the frame.
        JPanel bigPanel = new JPanel();
        // four smaller panels will be put underneath each other.
        bigPanel.setLayout(new GridLayout(4,1));

        JPanel upPanel = new JPanel();
        bigPanel.add(upPanel);
        JPanel downPanel = new JPanel();
        bigPanel.add(downPanel);
        JPanel endPanel = new JPanel();
        bigPanel.add(endPanel);

        /*  We add three button with labels. Note that as such the buttons
         *  do not do anything, but that it is necessary to add corresponding
         *  ActionListeners. This is done in corresponding classes.
         */
        JButton upButton = new JButton("Click to count up.");
        upButton.addActionListener(new UpCounterSep(this));
        upPanel.add(upButton);

        JButton downButton = new JButton("Click to count down.");
        downButton.addActionListener(new DownCounterSep(this));
        downPanel.add(downButton);

        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener());
        endPanel.add(endButton);

        // Panel to display the counter.
        ResultPanelSep resultPanel = new ResultPanelSep(counterObject);
        bigPanel.add(resultPanel);
        
        this.add(bigPanel);
    }

    /**
     *  getter for the counterObject
     *  @return The counterObject
     */
    public Counter getCounterObject() {
        return this.counterObject;
    }
}
