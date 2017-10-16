import javax.swing.*;

public class TextDemo1	{
	public static void main (String[] arg) {
		String s1;
		s1 = "Valkommen";
		String s2;
		s2 = s1;
		s2 = s2 + " hit";
		s2 = s2 + " " + System.getProperty("user.name");
		JOptionPane.showMessageDialog(null, s2);
	}
}