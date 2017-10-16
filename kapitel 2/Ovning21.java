import javax.swing.*;

public class Ovning21	{
	public static void main (String[] arg) {
		String s1;
		s1 = "Valkommen";
		String s2;
		s2 = s1;
		s2 = s2 + " hit";
		s2 = s2 + " " + System.getProperty("user.name");
		String s3;
		s3 = s2;
		s3 = s3 + " som anvander";
		s3 = s3 + " " + System.getProperty("os.name");
		JOptionPane.showMessageDialog(null, s3);
	}
}