
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;


public class Plant {
	private Point pos;
	protected ImageIcon image;
	
	public Plant(int x, int y) {
		pos = new Point(x,y);
	}
	
	public void draw(Graphics g) {		
		if (image == null) {
			g.drawString("Plant", pos.x, pos.y);
		} else {
			image.paintIcon(null, g, pos.x, pos.y);
		}
	}
	
}
