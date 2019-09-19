
import java.util.*;
import java.text.*;
import java.util.Scanner;

public class JavelinGame {
    
    public static void main(String[] args) {
    	
	String P1, P2, P3, P4;
		
	Scanner scan  = new Scanner(System.in);
		
		double max = 150;
		double min = 50;
		
		Random rand = new Random();
		
		NumberFormat formatter = new DecimalFormat("#0.00");

System.out.println("\nWelcome To Javeline Game");
	    
	System.out.println("\nPlease Enter the Name of the Player/s");
		System.out.print("\nEnter Player 1: ");
		P1 = scan.nextLine();
	
		System.out.print("Enter Player 2: ");	
		P2 = scan.nextLine();
		
		System.out.print("Enter Player 3: ");	
		P3 = scan.nextLine();

		System.out.print("Enter Player 4: ");	
		P4 = scan.nextLine();
	   
		
		double throw1 = rand.nextDouble() * (max - min) + min;
	System.out.println("\nPlayer 1: " + P1 + " throws at " + formatter.format(throw1) + " meters");
		
		double throw2 = rand.nextDouble() * (max - min) + min;
	System.out.println("Player 2: " + P2 + " throws at " + formatter.format(throw2) + " meters");
		
		double throw3 = rand.nextDouble() * (max - min) + min;
	System.out.println("Player 3: " + P3 + " throws at " + formatter.format(throw3) + " meters");
		
		double throw4 = rand.nextDouble() * (max - min) + min;
	System.out.println("Player 4: " + P4 + " throws at " + formatter.format(throw4) + " meters");
		

System.out.println("\nEnd of Game. Thank You!");

    }
}
