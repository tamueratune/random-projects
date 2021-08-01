import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowerPower extends JPanel implements KeyListener {

    private Garden garden;
    private MathProblem prob;
    private final int GRASS_HEIGHT = 200;

    public FlowerPower() {
        garden = new Garden();
        prob = new MathProblem();
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        requestFocusInWindow();
        int w = getWidth();
        int h = getHeight();
        g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
        g.setColor(Color.BLUE);//sky
        g.fillRect(0, 0, w, h);
        g.setColor(new Color(131,179,2));//grass
        g.fillRect(0, h-GRASS_HEIGHT, w, GRASS_HEIGHT);
        g.setColor(Color.YELLOW); //sun
        g.fillOval(-100, -100, 200,200);

        prob.draw(g);
        garden.draw(g);

    }

    public static void main(String[] args) {
        var window = new JFrame("Flower Power 64");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.setContentPane(new FlowerPower());
        window.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        prob = new MathProblem();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
