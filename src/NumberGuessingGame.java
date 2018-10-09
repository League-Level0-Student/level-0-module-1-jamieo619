import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("Guess a number from 0 to 2.");
	Random rayray = new Random();
	int num2 = rayray.nextInt (3);
	if(num2==num) {
	JOptionPane.showMessageDialog(null, "You Guessed Correctly!!!");
	}
	else {
		JOptionPane.showMessageDialog(null,"You Guessed Wrong!!!");
	}
	}

} 

