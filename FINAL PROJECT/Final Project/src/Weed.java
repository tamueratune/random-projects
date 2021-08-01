import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Weed extends Plant{


       //constructors
        public Weed(int x, int y) {
             super(x,y);
             image = new ImageIcon("weed.png");

        }


      /*
        //extra credit Weed.
        public void drawWeed(Graphics a, int x, int y, int size){
              /*  a.setColor(Color.GREEN.darker());
                a.fillRect(x + 2,y,5,70);
                a.fillRoundRect(x + 1,y + 5,20,10,200,200);
                a.fillRoundRect(x + 1,y + 40,20,10,200,200);
                a.fillRoundRect(x - 18,y + 25,20,10,200,200);



        }
*/

}
