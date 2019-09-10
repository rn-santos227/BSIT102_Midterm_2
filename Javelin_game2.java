import java.util.Scanner;
import java.util.Random;

public class Javelin_game {

    public static void main(String [] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	Random ran = new Random();
    	
    	int min = 50;
    	int max = 130;
    	double throw1 = 20;
    	
    	
    	System.out.println("Input the name player 1: ");
    	   String Player1= scan.nextLine();
    	
    	System.out.println("Input the name player 2: ");
    	   String Player2= scan.nextLine();
      
    	System.out.println("Input the name player 3: ");
    	   String Player3= scan.nextLine();
    	
    	System.out.println("Input the name player 4: ");    
    	  String Player4= scan.nextLine();   
    		
    	double random1 = min + (max - min) * ran.nextDouble();
         double random2 = min + (max - min) * ran.nextDouble();	
    	  double random3 = min + (max - min) * ran.nextDouble();
           double random4 = min + (max - min) * ran.nextDouble();
    	
    	System.out.printf("\n" +Player1 + " thrown at " + String.format("%.2f", random1+=throw1));
    	System.out.printf("\n" +Player2 + " thrown at " + String.format("%.2f", random2+=throw1));
        System.out.printf("\n" +Player3 + " thrown at " + String.format("%.2f", random3+=throw1));
        System.out.printf("\n" +Player4 + " thrown at " + String.format("%.2f", random4+=throw1));
    	
    	
    }
    
    
}