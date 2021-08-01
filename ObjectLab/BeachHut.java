import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

public class BeachHut extends JPanel {
    private Point pos; 
    private Color roofColor;
    private Color wallColor;


    public BeachHut() {
        // Your custom initialization code here
    }

    public BeachHut(int x, int y) {

    }

    @Override
    public void paintComponent(Graphics a) {
        // Your custom rendering code here.
        a.setColor(Color.CYAN);
        var x = 0;
        var y = 0;
        var w = getWidth();
        var h = getHeight();
        a.fillRect(0, 0, w, h);

        // clouds
        a.setColor(Color.GRAY);
        a.fillOval(100, 30, 50, 50);
        a.fillOval(130, 30, 50, 50);
        a.fillOval(115, 10, 50, 50);

        a.fillOval(200, 30, 50, 50);
        a.fillOval(230, 30, 50, 50);
        a.fillOval(215, 10, 50, 50);

        a.fillOval(300, 50, 50, 50);
        a.fillOval(330, 50, 50, 50);
        a.fillOval(315, 30, 50, 50);

        // Trees leaves & bushes
        a.setColor(Color.GREEN);
        a.fillOval(500, 160, 80, 80);
        a.fillOval(550, 160, 80, 80);
        a.fillOval(530, 120, 80, 80);

        a.fillOval(580, 280, 80, 80);// bottom bushes
        a.fillOval(600, 280, 80, 80);
        a.fillOval(640, 280, 80, 80);
        a.fillOval(680, 280, 80, 80);
        a.fillOval(700, 280, 80, 80);
        a.fillOval(730, 280, 80, 80);

        a.fillOval(680, 210, 80, 80); // top bushes
        a.fillOval(720, 210, 80, 80);
        a.fillOval(690, 180, 80, 80);

        // Tree bark
        a.setColor(Color.ORANGE);
        a.fillRect(530, 235, 60, 155);

        public void drawHouse (Graphics a, int x, int y, Color c){
            // Body of the House
            a.setColor(Color.ORANGE);
            a.fillRect(100 + y, 150 + x, 150, 150);

            // Roof
            a.setColor(Color.PINK);
            a.fillRect(80 + y, 130 + x, 190, 20);
            a.fillRect(100 + y, 110 + x, 150, 20);
            a.fillRect(120 + y, 90 + x, 110, 20);
            a.fillRect(140 + y, 70 + x, 70, 20);

            // Door & Windows
            a.fillRect(160 + y, 240 + x, 40, 60);
            a.fillOval(190 + y, 160 + x, 40, 60);
            a.fillOval(120 + y, 160 + x, 40, 60);
        } 

        // signs
        a.setColor(Color.RED);
        a.drawRect(140, 220 + x, 80, 20);
        a.drawString(n, 145, 235 + x);

        a.setColor(Color.BLUE);
        a.drawRect(350, 70, 100, 20);
        a.drawString(g, 355, 85);

        // Beach
        a.setColor(Color.YELLOW);
        a.fillRect(0, 300, 800, 50);

        a.setColor(Color.BLUE);
        a.fillOval(-150, 320, 1100, 200);

    }

    public static void main(String[] args) {
        JFrame windowbox = new JFrame();
        windowbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowbox.setSize(800, 500);
        windowbox.setContentPane(new graphicLab());
        windowbox.setVisible(true);
    }
}