import java.util.function.Function;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.net.URL;

import java.util.*;
import java.util.regex.Pattern;
/**
 *  In this class we show how to display the graph of a function
 *
 *  version 2016-11-20
 *  author Manfred Kerber
 */
public class FunctionGraph extends JPanel {
    /** The static constants are defined for the size of the panel and
     * the size of the display. xSize is the width of the panel in
     * pixels, ySize the height in pixels, dXSize and dYSize extra
     * pixels to foster for the header. 
     */
    public static final int xSize = 600;
    public static final int ySize = 600;
    public static final int dXSize = 0;
    public static final int dYSize = 50;

    /**
     *  f is the function to be displayed.
     */
    public static final Function<Double,Double>
    //f = x -> {return Math.exp(x/(x*x +2));};
        f = x -> {return x*x*x - 8 * x * x;};
    /**
     *  The method calls the function to be displayed with 200
     *  elements on the x-axis equally distributed between -20 and 20.
     *  @param g The graphics component used for painting.
     */
    public static void displayGraph(Graphics g) {
        displayGraph(g, f, 200, -20, 20);
    }


    /**
     *  The constructor does not take any arguments.
     */
    public FunctionGraph() {}


    /**
     *  The method creates a frame of the size given by the static
     *  constants. A panel of type FunctionGraph is added to the
     *  frame. We draw on the panel by adding to the panel by
     *  overriding the paintComponent method.
     */
    public static void display() {
	JFrame application = new JFrame();
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	/* creates a window of size size slightly bigger in y direction
	 * to foster for the menu bar.
         */
	application.setSize(xSize+dXSize,ySize+dYSize); 
       	
	FunctionGraph panel = new FunctionGraph();
	application.add(panel);   
	application.setVisible(true); // makes the application visible.

    }

    @Override
    /**
     *    Override the paintComponent method from the JPanel class.
     *    We display the graph in a separate displayGraph method.
     *    @param g The graphics component used for painting.
     */
    public void paintComponent(Graphics g){
	super.paintComponent(g);
        displayGraph(g);
        repaint();
    }

    /**
     *   The method approximates the maximal value of the function f
     *   in the interval [a,b] by dividing the interval in n equal
     *   parts and evaluating the function at the (n+1) different
     *   elements. It is assumed that b is greater than a.
     *   @param f The function to be evaluated.
     *   @param n The number of points to be evaluated.
     *   @param a The lowest x-value to be considered.
     *   @param b The highest x-value to be considered.
     *   @return An approximation of the maximal value of f in the
     *   interval [a,b] (evaluated at a and b, and at the n-1
     *   equidistant values in between).
     */
    public static double max(Function<Double,Double> f, int n,
                             double a, double b) {
        double x, y;
        double max = f.apply(a);
        double delta = (b - a)/n;
        /* Loop invariant: max contains the maximum of all values of
         * the function f(x) considered so far, i.e., the maximum of
         * f(a), f(a + delta), f(a + 2 * delta), ..., f(a + i * delta).
         * Consider for i = 0: f(a); for i = n: f(b).
         */
        for (int i = 0; i <= n ; i++){
            x = a + delta * i;
            y = f.apply(x);
            if (y > max) {
                max = y;
            }
        }
        return max;
    }

    /**
     *   The method approximates the minimal value of the function f
     *   in the interval [a,b] by dividing the interval in n equal
     *   parts and evaluating the function at the (n+1) different
     *   elements. It is assumed that b is greater than a.
     *   @param f The function to be evaluated.
     *   @param n The number of points to be evaluated.
     *   @param a The lowest x-value to be considered.
     *   @param b The highest x-value to be considered.
     *   @return An approximation of the minimal value of f in
     *   the interval [a,b] (evaluated at a and b, and at the n-1
     *   equidistant values in between).
     */
    public static double min(Function<Double,Double> f, int n,
                             double a, double b) {
        double x, y;
        double min = f.apply(a);
        double delta = (b - a)/n;
        /* Loop invariant: min contains the minimum of all values of
         * the function f(x) considered so far, i.e., the minimum of
         * f(a), f(a + delta), f(a + 2 * delta), ..., f(a + i * delta).
         * Consider for i = 0: f(a); for i = n: f(b).
         */
        for (int i = 0; i <= n ; i++){
            x = a + delta * i;
            y = f.apply(x);
            if (y < min) {
                min = y;
            }
        }
        return min;
    }

    
    /**
     *   The method draws the x-axis if 0 is in the interval [min,max]
     *   It is assumed that the function is not constant.
     *   @param g The graphics component used for painting.
     *   @param min The minimal y-value of the function in the interval. 
     *   @param max The maximal y-value of the function in the interval.
     *   @param a The minimal x-value in the interval. 
     *   @param b The maximal x-value in the interval. 
     */
    public static void drawXAxis(Graphics g, double min, double max,
                                 double a, double b){
        if (min <= 0 && max >=0 && min != max) {
            g.drawLine(0, (int) Math.round(max * ySize/(max-min)),
                       xSize, (int) Math.round(max * ySize/(max-min)));
        }
    }

    /**
     *   The method draws the y-axis if 0 is in the interval [a,b]
     *   @param g The graphics component used for painting.
     *   @param a The minimal x-value in the interval. 
     *   @param b The maximal x-value in the interval. 
     */
    public static void drawYAxis(Graphics g, double a, double b) {
        if (a <= 0 && b >= 0 && a != b){
            g.drawLine((int) Math.round(b * xSize/(b-a)), 0,
                       (int) Math.round(b * xSize/(b-a)), ySize);
        }
    }
    
    /**
     *   The method draws the graph of function f in the interval [a,b]
     *   @param g The graphics component used for painting.
     *   @param f The function to be drawn.
     *   @param n The number of equidistant intervals to be drawn.
     *   @param a The minimal x-value in the interval. 
     *   @param b The maximal x-value in the interval. 
     */
    public static void displayGraph(Graphics g, Function<Double,Double> f,
                                    int n, double a, double b) {
        if (a >= b) {
            throw new IllegalArgumentException();
        } else {
            int[] xPoints = new int[n+1];
            int[] yPoints = new int[n+1];
            double x, y;
            double max = max(f,n,a,b);
            double min = min(f,n,a,b);
            /* Loop: Add x and y values to the corresponding arrays
             * for a, b and n-1 equidistant values in between.
             */
            for (int i = 0; i <= n ; i++){
                x = a + (b - a) * i / n;
                y = f.apply(x);
                xPoints[i] = (int) Math.round((x-a) * xSize/(b-a));
                yPoints[i] = (int) Math.round((max - y)* ySize/(max-min));
            }
            /* Draw x- and y-axes. */
            drawXAxis(g,min,max,a,b);
            drawYAxis(g,a,b);
            g.setColor(Color.BLUE);
            /* Draw graph */
            g.drawPolyline(xPoints, yPoints, n);
        }
    }


    /*
     * Main method to start.
     */
    public static void main(String[] args) {
        display();
    }
}
