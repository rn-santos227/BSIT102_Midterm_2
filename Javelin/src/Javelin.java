
import java.util.*;
import java.text.*;
import java.util.Scanner;

public class Javelin {
    
    public static void main(String[] args) {
    	
		
		String p1, p2, p3, p4;
		
		Scanner scan  = new Scanner(System.in);
		
		double max = 150;
		double min = 50;
		Random rand = new Random();
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		
	    System.out.println("Welcome To Javeline Game");
	    
		System.out.println(" ");
		
		System.out.print("Enter Player 1 ");
		p1 = scan.nextLine();
	
		System.out.print("Enter Player 2 ");	
		p2 = scan.nextLine();
		
		System.out.print("Enter Player 3 ");	
		p3 = scan.nextLine();

		System.out.print("Enter Player 4 ");	
		p4 = scan.nextLine();
	   
		
			double throw1 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player1: " + p1 + " throws at " + formatter.format(throw1) + "m");
		
			double throw2 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player2: " + p2 + " throws at " + formatter.format(throw2) + "m");
		
			double throw3 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player3: " + p3 + " throws at " + formatter.format(throw3) + "m");
		
			double throw4 = rand.nextDouble() * (max - min) + min;
		System.out.println("Player4: " + p4 + " throws at " + formatter.format(throw4) + "m");
		
    }
}
