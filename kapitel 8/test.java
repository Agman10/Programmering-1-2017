import javax.swing.*;

public class test	{
	public static void main (String[] arg) {
       String s;
	   s = JOptionPane.showInputDialog("Antal samtal?");
	   int n = Integer.parseInt(s);
	   
	   s = JOptionPane.showInputDialog("Minuter dagtid?");
	   int dag = Integer.parseInt(s);
	   
	   s = JOptionPane.showInputDialog("Minuter ovrig tid?");
	   int ovr = Integer.parseInt(s);
	   
	   //double kos = Mobil.manadskostnad(n, dag, ovr);
	   JOptionPane.showMessageDialog(null,"Kostnad: " + kos);
	
	}
}