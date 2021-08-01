import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.*;


public class Garden {
    //fields
    private ArrayList<Plant> plants;
    private int posX, posY;
    private final int TOP_ROW = 400;
    private final int BOTTOM_ROW = 450;

    //project 4 (Symbolic constants).
    public static final int CONTINUE = 0;
    public static final int WEED = 2;
    public static final int FLOWER = 1;

    private static String userInput = " ";
    private static int answer;

    public Garden() {
        plants = new ArrayList<>();
        posX = 0;
        posY = TOP_ROW;



    }
    private void newXY() {
        posX += 50;
        if (posY == TOP_ROW) {
            posY = BOTTOM_ROW;
        } else {
            posY = TOP_ROW;
        }
    }
    public void newFlower() {
        plants.add(new Flower(posX, posY));
        newXY();


    }

    public void newWeed(){

            plants.add(new Weed( posX,posY));
            newXY();

        }
        public void clear(){

        plants.clear();
        posX = 0;
        posY = TOP_ROW;

        }


    public void draw(Graphics a) {
        //draw methods
        for (var p : plants) {
            p.draw(a);
        }

    }
}