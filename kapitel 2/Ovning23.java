import javax.swing.*;

public class Ovning23	{
	public static void main (String[] arg) {
		String name;
		String greetings;
		String lastname;
		name = JOptionPane.showInputDialog("What's your name?");
		lastname = JOptionPane.showInputDialog("What's your last name?");
		greetings = "Welcome " + name + " " + lastname;
		JOptionPane.showMessageDialog(null, greetings);
	}
}