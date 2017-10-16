import javax.swing.*;

public class test	{
	public static void main (String[] arg) {
		
		String today;
		today = JOptionPane.showInputdialog(null, "Vad är det för dag idag?");
		
		if (today.equalsIgnoreCase("Måndag")) {
			JOptionPane.showMessageDialog(null,"Programmering och Fysik");
		} else if (today.equalsIgnoreCase("Tisdag")) {
			JOptionPane.showMessageDialog("Svenska och Engelska");
		}
		
		switch(today) {
			case "Måndag":
				JOptionPane.showMessageDialog(null,"Programmering och Fysik");
				break;
			case "Tisdag":
				JOptionPane.showMessageDialog(null,"Svenska och Engelska");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Det förstår jag inte");
			
		int month = 10;
		int daysOfMonth;
		switch(month)
		}
	}
}