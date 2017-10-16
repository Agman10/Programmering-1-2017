import javax.swing.*;

public class Ovning82	{
	public static void main (String[] arg) {
		
	int year = Integer.parseInt(JOptionPane.showInputDialog("Year: "));
	System.out.println("Is leap year: " + calendar.isLeapYear(year));
	
	}
}
	
	class calendar {
		
		public static boolean isLeapYear(int year) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return true;
			} else {
				return false;
			}
	}
}

