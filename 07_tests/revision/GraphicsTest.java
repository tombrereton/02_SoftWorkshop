import javax.swing.*;
import java.awt.*;


public class GraphicsTest extends JPanel {


	private int[] xCoords;
	private int[] yCoords;

	public GraphicsTest (int[] xCoords, int[] yCoords){
		this.xCoords = xCoords;
		this.yCoords = yCoords;
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawRect(0,0,100,100);
		g.fillPolygon(this.xCoords, this.yCoords, this.xCoords.length);
	}

	public static void main(String[] args){
		JFrame frame = new JFrame();

		final int WIDTH = 600;
		final int HEIGHT = 400;

		frame.setSize(WIDTH, HEIGHT);

		int[] xCoords = {0,50,100};
		int[] yCoords = {400,300,400};


		GraphicsTest p = new GraphicsTest(xCoords,yCoords);


		frame.add(p);

		frame.setVisible(true);




	}

}

