import javax.swing.*;

public class Ovning51	{
	public static void main (String[] arg) {
        
	String s = JOptionPane.showInputDialog("n?");
    int n = Integer.parseInt(s);
	int summa=0;
	int k=1;
	while (k <= n) {
		summa = summa + (k * k);
		k++;
	}
	JOptionPane.showMessageDialog(null, "summan blir " + summa);
	}
}