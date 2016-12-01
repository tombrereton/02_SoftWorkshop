import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
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
 *  While we could in principle have a clear separation again by
 *  having another three separate files for the upPanel, the
 *  downPanel, and the resultPanel, there is a problem with this,
 *  since we would need to create an object to access from the
 *  upPanel, the downPanel, and the resultPanel classes.  It is much
 *  easier to create a so-called inner classes, which are private and
 *  below the ThreeButtons class, but can access all variables in the
 *  class directly. Also, here we do not make use of a separate
 *  Counter class, but integrate the counter in the ThreeButtons
 *  class. This looks much easier here than the corresponding classes
 *  with the separation. Note, however, that this is a VERY simple
 *  example, for which the overhead to have a clear separation looks
 *  very big compared to what is achieved. If the application were
 *  much bigger then the overhead would be very worthwhile to have a
 *  clear separation.
 * 
 *  @version 2015-11-24
 *  @author Manfred Kerber
 */

public class ThreeButtons extends JFrame{
    /**
     *  The frame size is set by final static variables.
     */
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private int counter; // the one and only field variable.

    public ThreeButtons() {
        super();
        this.counter = 0;

        this.setSize(WIDTH, HEIGHT);
        this.setTitle("First Window Class");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

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
        upButton.addActionListener(new UpCounter());
        upPanel.add(upButton);

        JButton downButton = new JButton("Click to count down.");
        downButton.addActionListener(new DownCounter());
        downPanel.add(downButton);

        JButton endButton = new JButton("Click to end program.");
        endButton.addActionListener(new EndingListener());
        endPanel.add(endButton);

        ResultPanel resultPanel = new ResultPanel();
        bigPanel.add(resultPanel);
        
        this.add(bigPanel);
    } // end of constructor

    /**
     * getter for counter
     * @return the counter we change and display.
     */
    public int getCounter() {
        return this.counter;
    }

    /**
     * setter for counter
     * @param counter the counter we change and display is updated to
     * its new value
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     *  The following class is an implementation of the ActionListener
     *  and increases the counter by one. This is an inner class and
     *  as such cannot be public. Although we write comments they are
     *  not extracted in the JavaDoc since the class is not accessible
     *  from the outside.
     */
    private class UpCounter implements ActionListener {
    
        /**
         *  On a clicking event, the counter is increased by one and the
         *  panel is repainted.
         *  @param e The click event.
         */
        public void actionPerformed(ActionEvent e) {
            setCounter(getCounter() + 1);
            System.out.println(getCounter());
            repaint();
        }
    }

    /**
     *  The class is an implementation of the ActionListener and
     *  decreases the counter by one. This is an inner class and as
     *  such cannot be public.
     */
    private class DownCounter implements ActionListener {
    
        /**  On a clicking event, the counter is increased by one and the
         *  panel is repainted.
         *  @param e The click event.
         */
        public void actionPerformed(ActionEvent e) {
            setCounter(getCounter() - 1);
            System.out.println(getCounter());
            repaint();
        }
    }

    /**
     *  The class represents a panel that displays the current value of
     *  the counter.
     */
    private class ResultPanel extends JPanel {
    
        /**
         *    Override the paintComponent method from the JPanel class.
         *    Then we write the counter on the graphics element g
         *    @param g The graphics component used for painting.
         */
        @Override
        public void paintComponent(Graphics g){
            Font myfont = new Font("Dialog",1,18);
            setFont(myfont);
            g.drawString("counter: " + getCounter(), 30, 20);
        }
    }
}
