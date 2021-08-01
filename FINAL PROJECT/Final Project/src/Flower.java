/**
 * This Class simply draws a mathematical garden game.
 * @author: Tamuera Samuel Tune;
 */

import javax.swing.ImageIcon;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;


public class Flower extends Plant {
    //fields

    //Constructors
    public Flower(int x, int y){
        super(x,y);

        ArrayList<String>plants = new ArrayList<>();

        plants.add("flower0.png");
        plants.add("flower1.png");
        plants.add("flower2.png");
        plants.add("flower3.png");

        Random rand = new Random();
        int upperbound = 5-1;
        int int_random = rand.nextInt(upperbound);
        image = new ImageIcon(plants.get(int_random));



    }


}
