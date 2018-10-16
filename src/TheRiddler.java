import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"GUESS THE RIDDLES!!!");
	JOptionPane.showMessageDialog(null,"P.S. write the answer in all lowercase letters");
	String coin = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
	if(coin.equals("coin")) {
		JOptionPane.showMessageDialog(null,"CORRECT!!!");
	
	}
	else {
		JOptionPane.showMessageDialog(null,"WRONG!!!");
		JOptionPane.showMessageDialog(null,"IT WAS A COIN!!!");
	}
	
}


}
