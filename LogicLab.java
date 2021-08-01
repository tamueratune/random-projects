import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class LogicFun extends Jpanel {

    public static void main(String[] args) {
        JFrame windowbox = new JFrame();
        windowbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowbox.setSize(500, 500);
        windowbox.setContentPane(new LogicFun());
        windowbox.setVisible(true);

    }

    public LogicFun() {

        String name = JOptionPane.showInputDialog("Please Enter Full Name.");
        String input = JOptionPane.showInputDialog("Please Enter Age at the end of the Year.");

    }

    @Override
    public void paintComponent(Graphics a) {

    }

}