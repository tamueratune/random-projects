import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class FlowerPower extends JPanel implements KeyListener {
    //fields
    private Garden garden;
    private MathProblem math;

    public static final int main_loop = 1;
    public static final int endgame = 2;

    //additional field added.
    int state = main_loop;
    int p = 0;
    int score = 0;

    String name;






    public FlowerPower(){
        //instantiating methods.
        garden  = new Garden();
        math = new MathProblem();
        addKeyListener(this);

        // asking user's name.
        name = (String) JOptionPane.showInputDialog("PLEASE ENTER PLAYERS NAME:");





    }

    @Override
    public void paintComponent(Graphics a) {
        // Creating a cyan background.
        var w = getWidth();
        var h = getHeight();

        requestFocusInWindow();

        a.setColor(Color.BLUE);
        a.fillRect(0, 0, w, h);

        a.setColor(Color.green.darker().darker().darker().darker());
        a.fillRect(0, 400, w, h);

        a.setColor(Color.yellow);
        a.fillOval(-50,-50, 150,150);

        //calling objects from other classes.
        garden.draw(a);
        if (state == main_loop){

            math.draw(a);
            setVisible(true);

        }
        // END GAME MESSAGE
        else {
            a.setFont(new Font("serif", Font.PLAIN, 30));
            a.drawString("GAME OVER!!", 330, 200);
            a.drawString("TOTAL SCORE:"+" "+score, 300, 250);

            a.setFont(new Font("serif", Font.PLAIN, 20));
            a.drawString("DO YOU WANT TO PLAY AGAIN?", 300, 300);
            a.drawString("YES (PRESS Y) / NO (PRESS N)", 300, 350);
        }
        a.setFont(new Font("serif", Font.PLAIN, 25));
        a.setColor(Color.BLACK.brighter().brighter());
        a.drawString("SCORE:"+" "+score, 10, 40);

        a.setFont(new Font("serif", Font.PLAIN, 25));
        a.setColor(Color.BLACK.brighter());
        a.drawString("NAME:"+ " "+name, 550, 40);






        //extra credit
        //flappy birds
       drawBird(a, 0, 0);
       drawBird(a, 400,50);




    }
    //Extra Credit Coding (FLAPPY BIRD).
    public void drawBird(Graphics a, int x, int y) {
        a.setColor(Color.ORANGE);
        a.fillOval(x+200, y+80, 60, 40);
        a.setColor(Color.WHITE);
        a.fillOval(x+232, y+80, 25, 22);
        a.setColor(Color.BLACK);
        a.fillOval(x+240, y+85, 8, 8);

        a.setColor(Color.ORANGE.darker());
        a.fillRect(x+245, y+100, 25, 5);
        a.fillRect(x+245, y+106, 25, 5);
        a.setColor(Color.GRAY.darker());
        a.fillRect(x+205, y+100, 30, 25);
    }



    public static void main(String[] args) {
        JFrame window = new JFrame("MATHEMATICAL GARDEN");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setContentPane(new FlowerPower());
        window.setVisible(true);


    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

            if (state == main_loop) {
                int reply = math.receiveUserInput(e);
                //int n = e.getKeyCode();
                if (reply == garden.FLOWER) {
                    score += 10;
                    garden.newFlower();
                    p++;
                    if (p == 16) {
                        state = endgame;
                    } else {
                        math = new MathProblem();
                    }
                    //return;

                } else if (reply == garden.WEED) {
                    if (state == main_loop) {

                        score -= 5;
                        garden.newWeed();
                        p++;
                        if (p == 16) {
                            state = endgame;
                        } else {
                            math = new MathProblem();
                        }
                        //return;
                    }


                }

            }else {
                // Allows user to replay or end the game.
                if (state == endgame) {
                    int n = e.getKeyCode();
                    if (n == KeyEvent.VK_Y) {
                        state = main_loop;
                        garden.clear();
                        score = 0;

                    } else if (n == KeyEvent.VK_N) {
                        System.exit(0);


                    }

                }


            }

            repaint();

        }


    @Override
    public void keyReleased(KeyEvent e) {}
}