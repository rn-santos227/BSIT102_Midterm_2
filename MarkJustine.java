import java.util.*;
import java.text.*;

public class MarkJustine {
	
 public static void main(String[] args){
 	
 	String P1,P2,P3,P4;
 	Scanner scan = new Scanner(System.in);
 	double max = 150;
 	double min = 50;
 	Random rand = new Random();
 	NumberFormat formatter = new DecimalFormat("#0.00");
 	
 	System.out.println("WELCOME TO JAVELIN GAME!!!");
 	System.out.println(" ");
 	
 	System.out.println("Enter Player1 Name:");
 	P1 = scan.nextLine();
 	System.out.println("Enter Player2 Name:");
 	P2 = scan.nextLine();
 	System.out.println("Enter Player3 Name:");
 	P3 = scan.nextLine();
 	System.out.println("Enter Player4 Name:");
 	P4 = scan.nextLine();
 	
 	System.out.print(" ");
 	System.out.print(" ");
 	
 	double throw1 =rand.nextDouble() * (max - min) + min;
 	System.out.println(" Player1: " + P1 + " Throws at " + formatter.format(throw1) + "m");
 	double throw2 =rand.nextDouble() * (max - min) + min;
 	System.out.println(" Player2: " + P2 + " Throws at " + formatter.format(throw2) + "m");
 	double throw3 =rand.nextDouble() * (max - min) + min;
 	System.out.println(" Player3: " + P3 + " Throws at " + formatter.format(throw3) + "m");
 	double throw4 =rand.nextDouble() * (max - min) + min;
 	System.out.println(" Player4: " + P4 + " Throws at " + formatter.format(throw4) + "m");
 	
 	
 	
 }	
			
}