import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH = 1920;
	private static final int DEFAULT_HEIGHT = 1080;
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Input in = new Input("C:\\Users\\Aleks\\workspace\\OpenStreetMap\\outs\\out2");
		for(NodeList x: in.getListOfNodeList()){
			for(Node z: x.getNodeList()){
				g2.setColor(Color.BLACK);
				g2.drawLine((int)x.getNodeList().get(0).getX(), (int)x.getNodeList().get(0).getY(), (int)z.getX(), (int)z.getY());
				Ellipse2D point = new Ellipse2D.Double(z.getX(), z.getY(), 3, 3);
				g2.setColor(Color.RED);
				g2.draw(point);
				g2.fill(point);
			}
		}
	}
	public Dimension getPreferredSize() { 
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT); 
	}
}