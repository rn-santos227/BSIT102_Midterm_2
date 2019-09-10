import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;;
class javelinGame {
    
    public static void main(String[] args) {
    	Scanner a = new Scanner(System.in);
    	Random b = new Random();
    	DecimalFormat c = new DecimalFormat("#.##");
    		double min = 50.0;
    		double max = 130.0;
    			double rand1 = min + (max - min) * b.nextDouble();
    			double rand2 = min + (max - min) * b.nextDouble();
    			double rand3 = min + (max - min) * b.nextDouble();
    			double rand4 = min + (max - min) * b.nextDouble();
    				double throw1 = 20.00;
    				
    	
    	System.out.println("Enter Player 1 Name: ");
    	String player1 = a.nextLine();
    	
    	System.out.println("Enter Player 2 Name: ");
    	String player2 = a.nextLine();
    	
    	System.out.println("Enter Player 3 Name: ");
    	String player3 = a.nextLine();
    	
    	System.out.println("Enter Player 4 Name: ");
    	String player4 = a.nextLine();
    	
    		System.out.printf("Player 1:" + player1 + " throw at " + String.format("%.2f",throw1 + rand1)+"m");
    	System.out.println("");
    		System.out.printf("Player 2:" + player2 + " throw at " + String.format("%.2f",throw1 + rand2)+"m");
    	System.out.println("");
    		System.out.printf("Player 3:" + player3 + " throw at " + String.format("%.2f",throw1 + rand3)+"m");
    	System.out.println("");
    		System.out.printf("Player 4:" + player4 + " throw at " + String.format("%.2f",throw1sad
    			 + rand4)+"m");
    	System.out.println("");
    }
}