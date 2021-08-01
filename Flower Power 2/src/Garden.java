
import java.awt.Graphics;
import java.util.ArrayList;


public class Garden {
	private ArrayList<Flower> flowers;
	private ArrayList<Weed> weeds;
	
	public Garden() {
		//instantiate the arraylists
		flowers = new ArrayList<>();
		weeds = new ArrayList<>();
		
		//create the flowers and weeds,
		//add them to their respective arraylists
		flowers.add(new Flower(0, 400));
		weeds.add(new Weed(50, 450));
		flowers.add(new Flower(100, 400));
		flowers.add(new Flower(150, 450));
		flowers.add(new Flower(200, 400));
		flowers.add(new Flower(250, 450));
		flowers.add(new Flower(300, 400));
		flowers.add(new Flower(350, 450));
		weeds.add(new Weed(400, 400));
		flowers.add(new Flower(450, 450));
		flowers.add(new Flower(500, 400));
		flowers.add(new Flower(550, 450));
		flowers.add(new Flower(600, 400));
		flowers.add(new Flower(650, 450));
		flowers.add(new Flower(700, 400));
		flowers.add(new Flower(750, 450));
	}
	
	public void draw(Graphics g) {
		//loop through flowers; draw each
		for (var f : flowers) {
			f.draw(g);
		}
		
		//loop through weeds; draw each
		for (var w : weeds) {
			w.draw(g);
		}
	}

}
