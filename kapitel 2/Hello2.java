import javax.swing.*;

public class Hello2	{
	public static void main (String[] arg) {
		String name;
		String greetings;
		name = JOptionPane.showInputDialog("What's your name?");
		greetings = "Welcome " + name;
		JOptionPane.showMessageDialog(null, greetings);
	}
}