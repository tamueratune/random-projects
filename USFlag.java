import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;

public class USFlag extends JPanel {

	//Fields for the # of Stars && # of stripes
	int starRow;
	int starCol;
	int stripes;
	
	public USFlag() {
		//JOptionPane for Rows and Columns of Stars
		String input1 = JOptionPane.showInputDialog("How many rows of stars do you want for the U.S. Flag?");
		String input2 = JOptionPane.showInputDialog("How many columns of stars do you want for the U.S. Flag?");
		String input3 = JOptionPane.showInputDialog("How many stripes do you want for the U.S. Flag?");
		//Data Type converting String Inputs to Integers
		starRow = Integer.parseInt(input1);
		starCol = Integer.parseInt(input2);
		stripes = Integer.parseInt(input3);
		

	}

	@Override
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		//Coordinates for drawing variables defined here
		int x = 0;
		int y = 0;
		int stripesH = (height/stripes);
		int blueSqrW = (width/5)*2;
		int blueSqrH = stripesH * 7;
		int starWidth = blueSqrW/starCol;
		int starHeight = blueSqrH/starRow;
		
		//#1 step :Flag Main Color
		g.setColor(Color.WHITE);
		g.fillRect(x,y,width,height);
		//#2 step: Stripes Painted
		for (int stripesStart = 0; stripesStart < stripes; stripesStart++) {
			g.setColor(Color.RED);
			g.fillRect(x,y,width,stripesH);
			y += (stripesH*2);
		} y = 0;
		//#3 Step: Top Left Star Box
		g.setColor(Color.BLUE);
		g.fillRect(x,y,blueSqrW,blueSqrH);
		//#4 Step: Stars Painted in Box
		for (int starRowStart = 0; starRowStart < starRow; starRowStart++) {
			//For loop to get it into columns
			for (int starColStart = 0; starColStart < starCol; starColStart++) {
				g.setColor(Color.WHITE);
				g.fillOval(x,y,starWidth,starHeight);
				x += starWidth;
			}
			//Restting for Stars
			y += starHeight;
			x = 0;
		}
	}

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new USFlag());
		window.setVisible(true);
	}
}