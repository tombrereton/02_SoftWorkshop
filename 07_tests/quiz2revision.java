
import javax.swing.*;
import java.awt.*;

public class  quiz2revision extends JPanel {

	private int[] xCoords = {600/2-50,600/2,600/2+50};
	private int[] yCoords = {400, 200, 400};

	@Override
	public void paintComponent(Graphics g){

		super.paintComponent(g);
		g.drawRect(600/2 - 100 ,400/2-100,100,200);
		g.fillRect(100, 100, 50, 50);

		g.drawLine(0,0,600,400);

		setBackground(Color.red);

		Point[] topRowPoints = topRow(3);

		for (int i = 0; i < topRowPoints.length; i++) {
			g.fillOval(topRowPoints[i].x, topRowPoints[i].y, 50,50);
		}

		g.fillPolygon(xCoords, yCoords, 3);

		g.copyArea(100,200, 50, 200, 400, 50);

		

	}

	public Point[] topRow(int numberOfPoints){
		Point[] topRowArr = new Point[numberOfPoints];


	       for (int i = 0; i < numberOfPoints; i++){
	       		topRowArr[i] = new Point(600/numberOfPoints * i, 50);
	       }

		return topRowArr;	
	}

	

	public	static void main(String[] args){

		quiz2revision q2r = new quiz2revision();
	
		JFrame frame = new JFrame("Example Title!");

		final int FRAME_WIDTH = 600;
		final int FRAME_HEIGHT = 422;

		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(q2r);


		frame.setVisible(true);
	}

}
