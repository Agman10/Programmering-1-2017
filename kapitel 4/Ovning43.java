import javax.swing.*;

public class Ovning43	{
	public static void main (String[] arg) {
        
        int score = Integer.parseInt(JOptionPane.showInputDialog("Score: "));
		char grade;
		
		if(score < 25) {
		grade = 'F';
		} else if(score < 30) {
			grade = 'E';
		} else if(score < 35) {
			grade = 'D';
		} else if(score < 40) {
			grade = 'C';
		} else if(score < 45) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		
		System.out.println("Grade: " + grade);
		
	}
}