/**
 *  The actual counter class offers the wrapper for the counter with a
 *  getter and a setter.
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */

public class Counter{
    /**
     *  The only field variable.
     */
    private int counter;
    /**
     *  The constructor initializes the counter to 0.
     */
    public Counter() {
        this.counter = 0;
    }

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
}
