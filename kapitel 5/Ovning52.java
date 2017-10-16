import javax.swing.*;

public class Ovning52	{
	public static void main (String[] arg) {
        
	String s = JOptionPane.showInputDialog("n?");
    int n = Integer.parseInt(s);
	double summa=0;
	double k=1;
	while (k <= n) {
		summa = summa + (1.0 / k);
		k++;
	}
	JOptionPane.showMessageDialog(null, "summan blir " + summa);
	}
}