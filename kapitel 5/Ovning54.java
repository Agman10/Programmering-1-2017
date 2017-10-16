import javax.swing.*;

public class Ovning54	{
	public static void main (String[] arg) {
        
	while (true) {
	String s = JOptionPane.showInputDialog("Hojd i cm?");
	if (s == null)
	break;
    double n = Integer.parseInt(s);
	double stuts=0;
	while(n > 1) {
	n = (n * 0.7);
	stuts++;
	}
	
	
	
	JOptionPane.showMessageDialog(null, stuts + " studsar ");
	}
	}
}