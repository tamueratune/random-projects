import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class graphicLab extends JPanel {

    public graphicLab() {
        // Your custom initialization code here
    }

    @Override
    public void paintComponent(Graphics g) {
        // Your custom rendering code here
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new graphicLab());
        window.setVisible(true);
    }
}