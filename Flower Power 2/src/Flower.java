
import java.awt.Graphics;

import javax.swing.ImageIcon;


public class Flower extends Plant {
	
	public Flower(int x, int y) {
		super(x,y);
		int suffix = (int)(4*Math.random());
		String filename = "flower" + suffix + ".png";
		image = new ImageIcon(filename);
	}
	

}
