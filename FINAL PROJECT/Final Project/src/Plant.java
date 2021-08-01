import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

//Abstract class
abstract public class Plant {
    public ImageIcon image;
    private Point pos;
    private Object location;


    //constructors
    public Plant(int x, int y) {
        pos = new Point(x, y);

    }
    //Draw Method.
        // Draw Method for Weed .
    public void draw (Graphics a) {

        if (image == null) {
            a.setColor(Color.WHITE);
            a.drawString("Plant", pos.x, pos.y);
        } else {
            image.paintIcon(null, a, pos.x, pos.y);
            return;

        }
    }

    }
    /*
    //extra credit Weed.
    public void drawWeed(Graphics a, int x, int y, int size){
        a.setColor(Color.GREEN.darker());
        a.fillRect(x + 2,y,5,70);
        a.fillRoundRect(x + 1,y + 5,20,10,200,200);
        a.fillRoundRect(x + 1,y + 40,20,10,200,200);
        a.fillRoundRect(x - 18,y + 25,20,10,200,200);


    }

    //extra credits construct for Drawing flowers.
    public static void drawFlower(Graphics a, int x, int y, int size, Color c){
        a.setColor(Color.GREEN.darker().darker());
        a.fillRect(x + 17,y + 20 ,7,50);

        a.setColor(c);
        a.fillOval(x,y,size/2,size/2);
        a.fillOval(x ,y + size/2 ,size/2,size/2);
        a.fillOval(x + size/2,y ,size/2,size/2);
        a.fillOval(x + size/2,y + size/2,size/2,size/2);

        a.setColor(Color.BLACK);
        a.fillOval(x + size/4, y+size/4, size/2, size/2);

    }

     */
