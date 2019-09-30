import java.util.Scanner;
import java.util.Random;


public class JavelinGameMerced {

    public static void main(String[] args){
    	String Player1, Player2, Player3, Player4;
    	
    	Scanner input = new Scanner(System.in);
    	Random rand = new Random();
    	double maximum = 150;
    	double minimum = 50;
    	double P1 = 50 + (maximum - minimum) * rand.nextDouble();
    	double P2 = 50 + (maximum - minimum) * rand.nextDouble();
    	double P3 = 50 + (maximum - minimum) * rand.nextDouble();
    	double P4 = 50 + (maximum - minimum) * rand.nextDouble();
    	
    	
    	System.out.print("Enter Player 1 name: ");
    	Player1 = input.nextLine();
    	System.out.print("Enter Player 2 name: ");
    	Player2 = input.nextLine();
    	System.out.print("Enter Player 3 name: ");
    	Player3 = input.nextLine();
    	System.out.print("Enter Player 4 name: ");
    	Player4 = input.nextLine();
    	
    	
    	double thrown1 = rand.nextDouble() * (maximum - minimum) + minimum;
    	System.out.printf("Player 1: + Player1" + "thrown at %.2f %n", P1);
    	double thrown2 = rand.nextDouble() * (maximum - minimum) + minimum;
    	System.out.printf("Player 2: + Player2" + "thrown at %.2f %n", P2);
    	double thrown3 = rand.nextDouble() * (maximum - minimum) + minimum;
    	System.out.printf("Player 3: + Player3" + "thrown at %.2f %n", P3);
    	double thrown4 = rand.nextDouble() * (maximum - minimum) + minimum;
    	System.out.printf("Player 4: + Player4" + "thrown at %.2f %n", P4);
    }
    
    
}