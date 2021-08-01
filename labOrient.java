import javax.swing.JPanel;
import javax.swing.JFrame;

public class labOrient extends JPanel {

    public static void main(String[] args) {
        var window = new JFrame();

        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIST_ON_CLOSE);
        window.setContentPane(new labOrient());
        window.setVisible(true);

    }

}