import javax.swing.*;

public class Ovning42	{
	public static void main (String[] arg) {
        
        double ticket = Double.parseDouble(JOptionPane.showInputDialog("Price for ticket?"));
		double seasonTicket = Double.parseDouble(JOptionPane.showInputDialog("Price for season ticket?"));
		int visits = Integer.parseInt(JOptionPane.showInputDialog("How many visits?"));
		
		if((ticket*visits) > seasonTicket) {
			System.out.println("Worth it.");
		} else {
			System.out.println("Not worth it.");
		}   
	}
}