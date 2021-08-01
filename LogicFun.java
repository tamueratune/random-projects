import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LogicFun extends JPanel {
    // field
    ImageIcon img, img1, img2, img3, img4, img5, img6, img7, img8;
    int age;
    String gender;

    public static void main(String[] args) {
        JFrame windowbox = new JFrame();
        windowbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowbox.setSize(500, 500);
        windowbox.setContentPane(new LogicFun());
        windowbox.setVisible(true);

    }

    public LogicFun() {
        // creates drop-list for gender
        String[] gendOp = { "Select", "Male", "Female" };
        gender = (String) JOptionPane.showInputDialog(null, "Select Gender?", null, JOptionPane.QUESTION_MESSAGE, null,
                gendOp, gendOp[0]);

        String text = JOptionPane.showInputDialog("Please Enter Age at the end of the Year.");
        age = Integer.parseInt(text);// converts strings into recognizable numerical functions.

        img = new ImageIcon("rockchapel.jpg");
        img1 = new ImageIcon("beehive.gif");
        img2 = new ImageIcon("miamaid.gif");
        img3 = new ImageIcon("laurel.gif"); // images for age groups.
        img4 = new ImageIcon("RS.jpg");
        img5 = new ImageIcon("deacon.jpg");
        img6 = new ImageIcon("teacher.jpg");
        img7 = new ImageIcon("priest.jpg");
        img8 = new ImageIcon("elders.jpg");

    }

    @Override
    public void paintComponent(Graphics a) {

        if (gender.equals("Female")) {
            if (age >= 1 && age < 12) {
                a.drawString("You Go To Primary!!", 150, 30);
                img.paintIcon(null, a, 100, 50);
            }

            else if (age >= 12 && age <= 13) {
                a.drawString("You Belong to the Young Women 12-13 Class!!", 80, 30);
                img1.paintIcon(null, a, 100, 50);
            }

            else if (age >= 14 && age <= 15) {
                a.drawString("You Belong to the Young Women 14-15 Class!!", 80, 30);
                img2.paintIcon(null, a, 100, 50);
            }

            else if (age >= 16 && age <= 17) {
                a.drawString("You Belong to the Young Women 16-17 Class!!", 80, 30);
                img3.paintIcon(null, a, 100, 50);
            }

            else if (age >= 18 && age <= 120) {
                a.drawString("You are a member of thge Relief Society!!", 80, 30);
                img4.paintIcon(null, a, 100, 50);
            } else {
                a.drawString("Error ... Too Old/ Too Young!", 80, 30);
            }

        }

        else if (gender.equals("Male")) {

            if (age >= 0 && age < 12) {
                a.drawString("You Go To Primary!!", 150, 30);
                img.paintIcon(null, a, 100, 50);
            } else if (age >= 12 && age <= 13) {
                a.drawString("You Belong to the Deacon Quorum!!", 80, 30);
                img5.paintIcon(null, a, 100, 50);
            } else if (age >= 14 && age <= 15) {
                a.drawString("You Belong to the Teacher Quorum!!", 80, 30);
                img6.paintIcon(null, a, 100, 50);
            } else if (age >= 16 && age <= 17) {
                a.drawString("You Belong to the Priest Quorum!!", 80, 30);
                img7.paintIcon(null, a, 100, 50);
            } else if (age >= 18 && age <= 119) {
                a.drawString("You are a member of the Elders Quorum!!", 80, 30);
                img8.paintIcon(null, a, 100, 50);
            } else {
                a.drawString("Error ... Too Old/ Too Young!", 80, 30);
            }
        } else {
            a.drawString("Error ... Please try again!", 80, 30); // if all statement fails Error message will execute.
        }

    }
}
