import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

public class LoopFun extends JPanel {
    int rowStart;
    int colStart;
    int Stripes;

    public LoopFun() {
        // Your custom initialization code here
    }

    @Override
    public void paintComponent(Graphics a) {
        // Your custom rendering code here.
        a.setColor(Color.RED);
        int x = 0;
        int y = 0;
        int w = getWidth();
        int h = getHeight();
        a.fillRect(0, 0, w, h);

    }

    ic static void main(String[] argJFrame windowbox = new JFrame();windowbox.setDefaultClseOpewindowbox.setSize(800, 500);windowbox.setContentPane(new LoopFun());
         }}

    