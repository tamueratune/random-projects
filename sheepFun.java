import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class sheepFun extends JPanel {

    public sheepFun() {
        // Your custom initialization code here
    }

    @Override
    public void paintComponent(Graphics g) {
        // Your custom rendering code here
        g.setColor(Color.ORANGE);
        var w = getWidth();
        var h = getHeight();
        var dx = 50;
        // Background

        g.fillRect(0, 0, w, h);
        g.setColor(Color.BLUE);
        g.fillOval(dx + 65, 200, 250, 100);
        g.fillOval(dx + 50, 150, 75, 75);
        // Sheeps Body

        g.fillRect(dx + 100, 250, 25, 100);
        g.fillRect(dx + 150, 250, 25, 100);
        g.fillRect(dx + 200, 250, 25, 100);
        g.fillRect(dx + 250, 250, 25, 100);
        // sheeps leg

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new sheepFun());
        window.setVisible(true);
    }
}