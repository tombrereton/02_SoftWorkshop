import oracle.jvm.hotspot.jfr.JFR;

import javax.swing.*;
import java.awt.*;

/**
 * Created by TomBrereton on 29/11/2016.
 */
public class ExampleDraw extends JPanel {


    // read about Graphics, docs
    public void paintComponent (Graphics g){

        // Use super method so we can set background colour, and other colours?
        super.paintComponent(g);
        g.drawRect(20,30, 100, 200);

        setBackground(Color.red);
    }

    public static void main(String[] args) {

        ExampleDraw ed = new ExampleDraw();

        JFrame frame = new JFrame("Example");

        frame.add(ed);
        frame.setSize(600, 400);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
