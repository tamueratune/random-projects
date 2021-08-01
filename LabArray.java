import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.io.*;
import java.awt.Color;
import java.util.*;
import java.util.Scanner;

public class LabArray extends JPanel {
    int[][] point = new int[200][200];

    public LabArray() {
        // Reads and locates the path of the file coordinates.
        var fileName = "desktop/smiley.txt";
        // make a new file varible
        var f = new File(fileName);

        try {
            // creates varible for the file scanner.
            var m = new Scanner(f);

            // Scans the file for error through a loop.
            while (m.hasNext()) {
                int x = m.nextInt();
                int y = m.nextInt();
                point[x][y] = 1;

                point[x - 1][y - 1] = 1;
                point[x - 2][y - 2] = 1;
                point[x - 3][y - 3] = 1;
                point[x - 1][y + 1] = 1;
                point[x - 2][y + 2] = 1;
                point[x - 3][y + 3] = 1;
                point[x + 1][y - 1] = 1;
                point[x + 2][y - 2] = 1;
                point[x + 3][y - 3] = 1;
                point[x + 1][y + 1] = 1;
                point[x + 2][y + 2] = 1;
                point[x + 3][y + 3] = 1;

            }
        } catch (FileNotFoundException n) {
            System.out.println("Error!, file named" + " " + fileName + " " + "cannot be found");
        }

    }

    @Override
    public void paintComponent(Graphics a) {
        // For loop.

        for (int r = 0; r < 200; r++) {
            for (int e = 0; e < 200; e++) {

                if (point[r][e] == 0) {
                    a.setColor(Color.BLACK);
                    a.fillRect(r, e, 1, 1);
                } else {
                    a.setColor(Color.WHITE);
                    a.fillRect(r, e, 1, 1);

                }

            }
        }

    }

    public static void main(String[] args) {
        JFrame windowbox = new JFrame();
        windowbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowbox.setSize(200, 230);
        windowbox.setContentPane(new LabArray());
        windowbox.setVisible(true);
    }

}