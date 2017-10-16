import javax.swing.*;

/* Syfte: Välkomnar för och efternamn som man skriver in.
   Av: August Möller
   Datum: 2017-09-18
*/

public class Ovning25	{
	public static void main (String[] arg) {
		String name;
		String greetings;
		String lastname;
		//här skriver man in sitt namn
		name = JOptionPane.showInputDialog("What's your name?");
		//här skriver man in sitt efternamn
		lastname = JOptionPane.showInputDialog("What's your last name?");
		//här hälsar den till namnet
		greetings = "Welcome " + name + " " + lastname;
		JOptionPane.showMessageDialog(null, greetings);
	}
}