import java.util.ArrayList;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *  We produce a BarChart out of an ArrayList of type Measure so that
 *  for ArrayLists that are not too long (less equal 10) the bars have
 *  a fixed width of 30 pixels. If the length between 31 and 100 the
 *  width is adjusted down to 3 pixels of the width of the bars, and
 *  between 100 and 600 the chart is displayed as a Polyline.
 *  For more than 600 values no display is given and a warning given.
 *
 *  @version 2016-11-24
 *  @author Manfred Kerber
 */

public class BarChart extends JPanel{

    /**
     *  We define some global static variables that store the size of
     *  the graphics, the width of the bars in the bar chart and the
     *  gap between to bars. We do NOT use the values directly in the
     *  program, since this will make the program very hard to read. A
     *  30 in the program may mean many things, but when we write
     *  barWidth(), then the reader gets a good understand what is
     *  attempted here. Also to have global variables makes it
     *  possible to change corresponding values in a single
     *  place. E.g., if we wanted to change the width of the bars, we
     *  can do this in a single place.
     *
     *  Note that we want to shrink the width of the bars and of the
     *  gaps (and in consequence the xOffset) when the ArrayList gets
     *  greater than 30. For this reason it is good not to have three
     *  separate values for barGap, barWidth and xOffset, but only ONE
     *  single variable barGap and have the other values as methods in
     *  dependency of the barGap. That is, we do not use variables
     *  barWidth and xOffset, but corresponding methods barWidth() and
     *  xOffset() instead.
     */
    public static final int xNumberOfPixels = 600;
    public static final int yNumberOfPixels = 400;
    public static final int xNumberOfPixelsAdded = 300; // for displaying long lists
    public static final int yNumberOfPixelsAdded = 100; // for displaying captions

    public static int barGap;

    /**
     *  @return The value of the global value barGap.
     */
    public static int barGap() {
        return barGap;
    }

    /**
     *  @return The value of the width of a bar, which is three times
     *  the value of the barGap.
     */
    public static int barWidth() {
        return 0; // This needs to be filled
    }

    /**
     *  @return The value of the xOffset between one bar and the next
     *  bar, which is the width of a bar plus the gap between two
     *  bars, i.e., four time the value of the barGap
     */
    public static int xOffset() {
        return 0; // This needs to be filled
    }
    
    /**
     *  We have two field variables, the 2-dimensional array to be
     *  displayed by bars, and the maximum of the numerical
     *  values so that the height of the different bars can be
     *  normalized. 
     */
    private ArrayList<Measure> measures;
    private int maximum;

    /**
     *  Constructor, which takes in the ArrayList of measures and
     *  initializes the two variables. The maximum is computed, hence
     *  we have only one parameter.
     *  @param measures The ArrayList of measures to be displayed as a
     *  bar chart.
     */
    public BarChart(ArrayList<Measure> measures) {
        this.measures = measures;
        this.maximum = getMaximal(measures);
    }

    /** 
     *  getter for measures
     *  @return The ArrayList to be displayed.
     */ 
    public ArrayList<Measure> getMeasures() {
        return measures;
    }

    /** 
     *  The method computes the maximal value in the (non-empty)
     *  ArrayList of measures.
     *  @param measures The ArrayList to be displayed.
     *  @return The maximal value in the list.
     */ 
    public static int getMaximal(ArrayList<Measure> measures) {
        if (measures.size() == 0) {
            throw new IllegalArgumentException();
        } else {
            int maximum = 1;
            // we need to compute the maximum here.
            return maximum;
        }
    }
    
    /**
     *  The method normalizes the bars in the range from 0 to
     *  yNumberOfPixels so that it makes use of all the pixels for the
     *  maximum and correspondingly fewer for smaller values.
     *  @param measure A particular measurement to be normalized.
     *  @param maximum The maximal value for the normalization.
     *  @return The value between 0 and the yNumberOfPixels.
     */
    public static int normalize(int measure, int maximum) {
        if (maximum == 0) {
            return measure;
        } else {
            // Careful: do not write yNumberOfPixels * (measure / maximum),
            // since this will give you always 0 except for maximal values.
            return 1; // needs to be computed
        }
    }
    
    
    @Override
    /**
     *  Override the paintComponent method from the JPanel class.
     *  We display the bars one after the other in a loop.  
     *  @param g The graphics component used for painting.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int numberOfMeasures = measures.size(); //length of the ArrayList
        int normalizedY;
        int max = this.maximum;
        if (numberOfMeasures <= 20) {
            barGap = 10;  // We have full size of 10 pixels for short ArrayLists
            // We adjust the size for ArrayLists between 21 and 200
            // Add further cases here.
        } else { /* We do nothing for more than 600 elements.
                  * The else part is redundant and only written to make
                  * it explicit that nothing is done in this case.
                  */
        }
    }

    /**
     *  We create a frame and a panel on it which displays the BarChart.
     *  @param measures The ArrayList of measures to be displayed.
     */
    public static void displayBarChart(ArrayList<Measure> measures){
        if (measures.size() > 600){
            System.out.println("Panel too small to display");
        } else {
            // JFrame to open a new window.
            JFrame frame = new JFrame();
        
            // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int frameWidth =  xNumberOfPixels + xNumberOfPixelsAdded;
            int frameHeight = yNumberOfPixels + yNumberOfPixelsAdded;

            frame.setSize(frameWidth,frameHeight); 
            BarChart panel = new BarChart(measures);
            frame.add(panel); 
            frame.setVisible(true); // makes the application visible.
        }
    }

    /**
     *  The method creates a random integer in the range between low and high
     *  @param low The lower bound for the random number.
     *  @param high The upper bound for the random number.
     *  @return The random number between low and high.
     */
    public static int randomRange(int low, int high) {
        return 1; // needs to be written
    }

    /** 
     *  A random String of the form "A.B."
     *  @return A random String consisting of two characters in the
     *  range A-Z, each following by a dot.
     */

    public static String randomName() {
        int r1 = (int) 1;
        int r2 = (int) 2;
        int offset = (int) 'A';
        return "" + (char) r1 + (char) r2;
    }

    /**
     *  The method creates an ArrayList of n measures with random
     *  names and values between low and high.
     *  @param n The length of the ArrayList to be created.
     *  @param low The lower bound of the values in the measures to be
     *  created.
     *  @param high The higher bound of the values in the measures to be
     *  created.
     *  @return A randomly generated ArrayList of Measure.
     */
    public static ArrayList<Measure> randomMeasures(int n,
                                                    int low, int high) {
        ArrayList<Measure> result = new ArrayList<Measure>();
        /* Add n randomly generated values */
        for (int i = 0; i < n; i++) {
            result.add(new Measure(randomName(), randomRange(low, high)));
        }
        return result;
    }

    
    /*
     * Main method
     */
    public static void main(String[] args) {
        try {
            Measure m1 = new Measure("John", 100);
            Measure m2 = new Measure("Mary", 200);
            Measure m3 = new Measure("Sam",  150);
            Measure m4 = new Measure("Al",   350);


            ArrayList<Measure> measures = new ArrayList<Measure>();
            measures.add(m1);
            measures.add(m2);
            measures.add(m3);
            measures.add(m4);

            displayBarChart(measures);
            displayBarChart(randomMeasures(10,100,1000));
            displayBarChart(randomMeasures(20,100,1000));
            displayBarChart(randomMeasures(30,100,1000));
            displayBarChart(randomMeasures(200,100,1000));
            displayBarChart(randomMeasures(600,100,1000));
            displayBarChart(randomMeasures(700,100,1000));
        
            ArrayList<Measure> empty = new ArrayList<Measure>();
            displayBarChart(empty);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Oops. The measures must be non-empty.");
        }
    }
}
