import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class windowLab extends JPanel {

    public static void main(String[] args) {
        var windowBox = new JFrame(); // creates a new window.
        windowBox.setSize(300, 300); // appoints the size of the window.
        windowBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allows the app to close when user closes it.
        windowBox.setContentPane(new windowLab()); //
        windowBox.setVisible(true); // makes window visible

    }

    @Override
    public void paintComponent(Graphics a) {
        // Allows user to

        a.drawString("Sam: Knock Knock!", 10, 15);
        a.drawString("Angel: Who's there?", 10, 35);
        a.drawString("Sam: Ruff Ruff", 10, 55);
        a.drawString("Angel: Ruff Ruff who?", 10, 75);
        a.drawString("Sam: Who let the dogs out? I heard barking!", 10, 95);
        // drawstring method takes 3 parameters - First: The intend string, Second is
        // the x coordinates and third is the Y coordinates.
    }

}