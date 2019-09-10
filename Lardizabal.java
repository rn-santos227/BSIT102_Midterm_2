import java.util.*;
import java.text.*;
public class JavelineGame {
	public static void main(String[]args){
		String p1, p2, p3, p4;
		Scanner scan  = new Scanner(System.in);
		double max = 150;
		double min = 50;
		Random rand = new Random();
		NumberFormat formatter = new DecimalFormat("#0.00");
	    System.out.println("Welcome To Javeline Game");
		System.out.println(" ");
		
		p1 = scan.nextLine();
			System.out.println("Enter Player 1");
		p2 = scan.nextLine();
			System.out.println("Enter Player 2");
		p3 = scan.nextLine();
			System.out.println("Enter Player 3");
		p4 = scan.nextLine();
	     	System.out.println("Enter Player 4");
		
		System.out.println(" ");
	    System.out.println(" ");
		
		
		 double Throw1 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player1" + p1 + "Throws at " + formatter.format(Throw1) + "m");
			double Throw2 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player2" + p2 + "Throws at " + formatter.format(Throw2) + "m");;
			double Throw3 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player3" + p3 + "Throws at " + formatter.format(Throw3) + "m");;
			double Throw4 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player4" + p4 + "Throws at " + formatter.format(Throw4) + "m");;
		
	}
}