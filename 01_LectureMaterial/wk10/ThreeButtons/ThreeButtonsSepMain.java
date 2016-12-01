/**
 *  Class with the main method to run the Threebuttons application.
 * 
 *  @version 2015-11-25
 *  @author Manfred Kerber
 */
public class ThreeButtonsSepMain{

    /*
     *  main method to generate an object and make it visible.
     */
    public static void main(String[] args) {
        Counter c = new Counter();
        ThreeButtonsSep w = new ThreeButtonsSep(c);
        w.setVisible(true);
    }
}
