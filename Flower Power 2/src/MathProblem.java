import java.awt.*;


public class MathProblem {
	public final int ADDITION = 0;
	public final int SUBTRACTION = 1;
	public final int MULTIPLICATION = 2;
	public final int DIVISION = 3;

	private int problemType;
	private int num1, num2, answer;
	private String operator;

	private final int MAX = 13;

	public MathProblem() {
		problemType = (int)(Math.random()*4);

		num1 = (int)(Math.random()*MAX);
		num2 = (int)(Math.random()*MAX);

		if (problemType == ADDITION) {
			answer = num1 + num2;
			operator = "+";
		} else if (problemType == SUBTRACTION) {
			int big = Math.max(num1, num2);
			int small = Math.min(num1, num2);
			num1 = big;
			num2 = small;
			answer = num1 - num2;
			operator = "-";
		} else if (problemType == MULTIPLICATION) {
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

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawString(num1 + " " + operator + " " + num2 + " = ", 300, 250);
		System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
	}
	
}
