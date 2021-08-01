import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
import java.io.File;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class MethodLap extends JPanel {
    ArrayList<String> french = new ArrayList<String>();
    ArrayList<String> english = new ArrayList<String>();

    // extra credits.
    ArrayList<String> imatang = new ArrayList<String>();
    ArrayList<String> kiribati = new ArrayList<String>();

    public MethodLap() {
        loadEnglishWords();
        loadFrenchWords();
        mainLoop();

    }

    // Stores the text file as an array.
    public void loadEnglishWords() {
        // Reads and locates the path and inputs the file into the coding.
        var file1 = "imatang.txt";
        // make a new file varible
        var f = new File(file1);

        try {
            // creates varible and scans array line by line.
            var m = new Scanner(f);

            while (m.hasNextLine()) { // scans txt file line by line.

                imatang.add(m.nextLine());

            }
        } catch (FileNotFoundException n) {

            // Error in file name will pop up the Error Message Below.
            String ERROR = "Error! File Not Found!";
            JOptionPane.showMessageDialog(null, ERROR, "Error! File Not Found!", JOptionPane.ERROR_MESSAGE);

        }

    }

    // Stores and Reads the french text.
    public void loadFrenchWords() {
        var file1 = "kiribati.txt";
        // calls varible for file
        var f = new File(file1);

        try {
            // creates varible for the file scanner.
            var m = new Scanner(f);

            while (m.hasNextLine()) { // scans the txt file line by line

                // french.add(m.nextLine());
                kiribati.add(m.nextLine());

            }
        } catch (FileNotFoundException n) {

            String error = "Error! File Not Found!";
            JOptionPane.showMessageDialog(null, error, "Error File Not Found!", JOptionPane.ERROR_MESSAGE);

        }

    }

    // Scans checks each line of array to get the matching number from both text
    // files.
    public String lookup(String word) {

        for (int e = 0; e < imatang.size(); ++e) {

            if (word.equals(imatang.get(e))) {

                return kiribati.get(e);
                // return kiribati.get(e);

            }

        }
        // If no value matches the input entered message will be executed.
        return "No Match Found";

    }

    // Infinite Loop to execute program until user exits.
    public void mainLoop() {
        while (true) {
            var input = JOptionPane.showInputDialog("Please Enter A Valid English Word");
            String result = lookup(input);
            String reply;

            if (result == ("No Match Found")) {

                reply = "You Have Entered an Incorrect Word, Please Write the Correct Word";

            } else {
                reply = "The Kiribati Translation is" + " " + result + " " + "Want to play again?";

            }

            // If user Presses No game will end and exit, but If yes it will restart.
            int r = JOptionPane.showConfirmDialog(null, reply, "Results", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.NO_OPTION) {

                break;

            } // else {
              // mainLoop();
              // }
        }

    }

    public static void main(String args[]) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new MethodLap());
        window.setVisible(true);
    }
}