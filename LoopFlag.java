import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class LoopFlag extends JPanel {

    // Field Varibles
    int rowStar;
    int colStar;
    int flagStripes;

    public LoopFlag() {
        // Asking User to Input Data.
        String input = JOptionPane.showInputDialog("Please Enter Number of Stripes you want on the Flag");
        flagStripes = Integer.parseInt(input);
        String input1 = JOptionPane.showInputDialog("Please Enter Number of Rows(Stars) you want on the Flag:");
        rowStar = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Please Enter Number of columns (Stars) you want on the Flag.");
        colStar = Integer.parseInt(input2);

    }

    @Override
    public void paintComponent(Graphics a) {

        // Declared Varibles
        int x = 0;
        int y = 0;
        int w = getWidth();
        int h = getHeight();
        int stripesHeight = (h / flagStripes);
        int blueBoxW = (w / 5) * 2;
        int blueBoxH = stripesHeight * 7;
        int starW = blueBoxW / colStar;
        int starH = blueBoxH / rowStar;

        // Background for the Flag
        a.setColor(Color.RED);
        a.fillRect(x, y, w, h);

        // Inputing loop for White Stripes
        for (int i = 0; i < flagStripes; i++) {
            a.setColor(Color.WHITE);
            a.fillRect(x, y + 37, w, stripesHeight);
            y += (stripesHeight * 2);
        }
        // returns the value of Y to 0.
        y = 0;

        // Blue Square/Box in the Flag.
        a.setColor(Color.BLUE);
        a.fillRect(x, y, blueBoxW, blueBoxH);

        // For loop for stars.
        for (int rStar = 0; rStar < rowStar; rStar++) {
            for (int cStar = 0; cStar < colStar; cStar++) {
                a.setColor(Color.WHITE);
                a.fillOval(x, y, starW, starH);
                x += starW;
            }
            y += starH;
            x = 0;
            // RESETS THE STARS TO 0.
        }

    }

    public static void main(String[] args) {
        JFrame windowbox = new JFrame();
        windowbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowbox.setSize(800, 500);
        windowbox.setContentPane(new LoopFlag());
        windowbox.setVisible(true);
    }
}