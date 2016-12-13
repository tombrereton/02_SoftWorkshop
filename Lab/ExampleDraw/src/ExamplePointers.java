import javax.swing.*;
import java.awt.*;
import java.awt.font.GraphicAttribute;

/**
 * Created by TomBrereton on 29/11/2016.
 */
public class ExamplePointers extends JPanel {
	private int m;
	private int n;


	public ExamplePointers(int m, int n){
		this.m = m;
		this.n = n;
	}

	public Point[] upperRow(int m){
		Point[] points = new Point[m];

		for (int i = 0; i< points.length; i++){
			points[i] = new Point(i * 100, 50);
		}

		return points;
	}

	public Point[] lowerRow(int n){
		Point[] points = new Point[n];

		for (int i = 0; i< points.length; i++){
			points[i] = new Point(i * 100, 400 - 50 - 100);
		}

		return points;
	}

	// read about Graphics, docs
	 public final void paintComponent (Graphics g){

		Point[] pointArray = upperRow(m);
		Point[] pointArrayLower = lowerRow(n);


		for ( int i = 0; i < pointArray.length; i++){
			g.fillOval(pointArray[i].x,
					pointArray[i].y,
					50,
					50);
		}

		for ( int i = 0; i < pointArray.length; i++){
			g.fillOval(pointArrayLower[i].x,
					pointArrayLower[i].y,
					50,
					50);
		}

		for(int i = 0; i < pointArray.length; i++){
			for(int j = 0; j < pointArray.length; j++){
				g.drawLine(pointArray[i].x + 25, pointArray[i].y + 25, pointArrayLower[j].x + 25, pointArrayLower[j].y + 25);
			}
		}
	}

	public static void main(String[] args) {


		JFrame frame = new JFrame("Example");

		ExamplePointers ed = new ExamplePointers(3,3);

		frame.add(ed);
		frame.setSize(600, 400);

		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
