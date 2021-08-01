import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

public class LoobFun extends JPanel {
    int RowStart;
    int ColStart;
    int numStripes;

    public LoobFun() {
        // Your custom initialization code here

    }

    @Override
    public void paintComponent(Graphics a) {

        // Your custom rendering code here.
        int w = getWidth();
        int h = getHeight();
        int x = 0;
        int y = 0;
        int Sheight = h / numStripes;
        int boxSquareW = (w / 5) * 2;
        int boxSquareH = Sheight * 7;
        // int wStar = boxSquareW / ColStart;
        // int hStar = boxSquareH / RowStart;

        a.setColor(Color.WHITE);
        a.fillRect(x, y, w, h);

        for (int startStripes = 0; startStripes < numStripes; startStripes++) {
            a.setColor(Color.RED);
            a.fillRect(x, y, boxSquareW, Sheight);
            y += (Sheight + 2);
        }

    }

    public static void main(String[] args) {
        JFrame windowbox = new JFrame();
        windowbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowbox.setSize(500, 500);
        windowbox.setContentPane(new LoobFun());
        windowbox.setVisible(true);
    }
}