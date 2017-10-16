import javax.swing.*;

public class Ovning53	{
	public static void main (String[] arg) {
        
	String s = JOptionPane.showInputDialog("n?");
    double n = Integer.parseInt(s);
	double stuts=0;
	while(n > 1) {
	n = (n * 0.7);
	stuts++;
	}
	
	
	
	JOptionPane.showMessageDialog(null, "summan blir " + stuts);
	}
}