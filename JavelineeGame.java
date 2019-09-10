import java.util.*;
import java.text.*;

public class JavelineeGame {
    
    public static void main(String[] args) {
    	String p1,p2,p3,p4;
    	Scanner scan = new Scanner(System.in);
    	double max = 150;
    	double min = 50;
    	Random rand = new Random();
        NumberFormat formatter = new DecimalFormat("#0.00");
    	
    	System.out.println("Welcome to the Javelin Game");
    	System.out.println(" ");
    	
    	System.out.print("Please enter Player 1 Name: ");
    	p1 = scan.nextLine();
    	System.out.print("Please enter Player 2 Name: ");
    	p2 = scan.nextLine();
    	System.out.print("Please enter Player 3 Name: ");
    	p3 = scan.nextLine();
    	System.out.print("Please enter Player 4 Name: ");
    	p4 = scan.nextLine();
    	
    	System.out.println(" ");
    	System.out.println(" ");
    	
    	double first = rand.nextDouble() * (max - min) + min;
    	System.out.println("Player 1: " + p1 + " throws at "  + formatter.format(first) + "m");
    	double second = rand.nextDouble() * (max - min) + min;
    	System.out.println("Player 2: " + p2 + " throws at "  + formatter.format(second) + "m");
    	double third = rand.nextDouble() * (max - min) + min;
    	System.out.println("Player 3: " + p3 + " throws at "  + formatter.format(third) + "m");
    	double fourth = rand.nextDouble() * (max - min) + min;
    	System.out.println("Player 4: " + p4 + " throws at "  + formatter.format(fourth) + "m");
    }
}
