import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Font;


public class MathProblem {
    //Fields
    private int num1;
    private int num2;
    private int answer;


    //Additional fields
    private String operator = "?";
    private String userInput = " ";
    private int mathProb;

    public final int ADDITION = 0;
    public final int SUBTRACTION = 1;
    public final int MULTIPLICATION = 2;
    public final int DIVISION = 3;
    private final int MAX = 13;

    private int attempt = 0;
   // private final int attempt = 3;



    public MathProblem() {
        userInput = "";
        mathProb = (int)(Math.random()*4);

        num1 = (int)(Math.random()*MAX);
        num2 = (int)(Math.random()*MAX);

        if (mathProb == ADDITION) {
            answer = num1 + num2;
            operator = "+";
        } else if (mathProb == SUBTRACTION) {
            int big = Math.max(num1, num2);
            int small = Math.min(num1, num2);
            num1 = big;
            num2 = small;
            answer = num1 - num2;
            operator = "-";
        } else if (mathProb == MULTIPLICATION) {
            answer = num1 * num2;
            operator = "\u00D7";
        } else {
            if (num2 == 0) {
                num2 = 1;	//num2 must not be zero
            }
            int prod = num1 * num2;
            answer = num1;
            num1 = prod;
            operator = "\u00F7";
        }
        
    }


    // Draw Method.
    public void draw(Graphics a){
             a.setFont(new Font("serif", Font.PLAIN, 30));
             a.drawString(num1 + "  " +operator+ " " + num2 + " " + "="+ " " +userInput, 330, 250);
             System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);


    }

    public int receiveUserInput(KeyEvent k) {

        //return values:
        //		0 = do nothing
        //		1 = correct answer
        //		2 = incorrect answer
        int reply = 0;
        var key = k.getKeyCode();
        if (key == KeyEvent.VK_BACK_SPACE || key == KeyEvent.VK_DELETE) {
            if (userInput.isEmpty() == false) {

                userInput = userInput.substring(0, userInput.length()-1);
            }

        }
            if (key == KeyEvent.VK_ENTER) {
                if (userInput.equals("" + answer)) {
                    System.out.println("ESS");
                    reply = 1;
                }
                if (!userInput.equals("" + answer)) {
                    System.out.println("BURE!!");
                    reply = 2;
                }

            } else  {
                var ch = k.getKeyChar();
                //ignore keystrokes other than digits
                if (ch >= '0' && ch <= '9') {
                    userInput += ch;
                }
        }
        return reply;
    }

}
