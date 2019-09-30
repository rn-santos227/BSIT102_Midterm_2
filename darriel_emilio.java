/**
 * @(#)jawelin_game.java
 *
 * jawelin_game application
 *
 * @author 
 * @version 1.00 2014/3/6
 */
 import java.util.Scanner;
 import java.util.Random;
 import java.text.DecimalFormat;
public class jawelin_game {
    
    public static void main(String[] args) {
    	
    DecimalFormat df = new DecimalFormat("#.##"); 	
    Scanner a = new Scanner(System.in);
    Random b = new Random();
    	double min= 50.0;
        double max=130.0;
        double throw1 = 20.0;
        	
        double rand0 = min + (max - min) * b.nextDouble();
        double rand1 = min + (max - min) * b.nextDouble();
        double rand2 = min + (max - min) * b.nextDouble();
        double rand3 = min + (max - min) * b.nextDouble();	             
        	             
                          
    	System.out.print("input player1:");
        String player1 = a.nextLine();
    	System.out.print("input player2:");
    	String player2 = a.nextLine();
    	System.out.print("input player3:");
    	String player3 = a.nextLine();
    	System.out.print("input player4:");
    	String player4 = a.nextLine();
    	
    	
    	System.out.printf("player1:" + player1 + "throw at " + String.format("%.2f",throw1 + rand0)+"m");
    	System.out.println("");
    	System.out.printf("player2:" + player2 + "throw at " + String.format("%.2f",throw1 + rand1)+"m");
    	System.out.println("");
    	System.out.printf("player3:" + player3 + "throw at " + String.format("%.2f",throw1 + rand2)+"m");
    	System.out.println("");
    	System.out.printf("player4:" + player4 + "throw at " + String.format("%.2f",throw1 + rand3)+"m");
    	System.out.println("");
    }
}
