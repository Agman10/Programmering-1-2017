import javax.swing.*;

public class Ovning81	{
	public static void main (String[] arg) {
	int radius = Integer.parseInt(JOptionPane.showInputDialog("Radius: "));
	System.out.println("Circumference: " + circle.circumference(radius) + "\nArea: " +
	circle.area(radius));
	}
}
	
	class circle {
		
		public static double circumference (int r) {
			return Math.PI * (r*2.0);
		}
		
		public static double area(int r) {
			return Math.PI * r * r;
	
	}
}

