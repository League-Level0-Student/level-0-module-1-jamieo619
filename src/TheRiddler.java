import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	JOptionPane.showMessageDialog(null,"GUESS THE RIDDLES!!!");
	JOptionPane.showMessageDialog(null,"P.S. write the answer in all lowercase letters");
	String coin = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
	if(coin.equals("coin")) {
		JOptionPane.showMessageDialog(null,"CORRECT!!!");
	score = score+100;
	JOptionPane.showMessageDialog(null, "Score: "+ score);
	}
	else {
		JOptionPane.showMessageDialog(null,"WRONG!!!");
		JOptionPane.showMessageDialog(null,"IT WAS A COIN!!!");
	}
	String mushroom = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
	if(mushroom.equals("mushroom")) {
		JOptionPane.showMessageDialog(null,"CORRECT!!!");
		score = score+100;
		JOptionPane.showMessageDialog(null, "Score: " + score);
	}
	else {
		JOptionPane.showMessageDialog(null,"Wrong");
		JOptionPane.showMessageDialog(null,"It was a mushroom");
	}
}


}
