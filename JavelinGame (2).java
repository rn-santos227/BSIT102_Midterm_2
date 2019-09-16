/**
 * @(#)JavelinGame.java
 *
 *
 * @author 
 * @version 1.00 2019/9/10
 */

import java.util.Random;
import java.util.Scanner;

public class JavelinGame {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Random rand = new Random();
    	String player1, player2, player3, player4;
    	
    	
    	System.out.println("What is your player name 1?");
    	player1 = sc.nextLine();
    	System.out.println("What is your player name 2?");
    	player2 = sc.nextLine();
    	System.out.println("What is your player name 3?");
    	player3 = sc.nextLine();
    	System.out.println("What is your player name 4?");
    	player4 = sc.nextLine();
    	
    	double start = 50;
		double end = 150;
		double random1 = new Random().nextDouble();
		double result1 = start + (random1 * (end - start));
		double random2 = new Random().nextDouble();
		double result2 = start + (random2 * (end - start));
		double random3 = new Random().nextDouble();
		double result3 = start + (random3 * (end - start));
		double random4 = new Random().nextDouble();
		double result4 = start + (random4 * (end - start));
		System.out.printf(player1 + " 5javelin thrown at %.2fM", result1);
		System.out.println();
		System.out.printf(player2 + " javelin thrown at %.2fM", result2);
		System.out.println();
		System.out.printf(player3 + " javelin thrown at %.2fM", result3);
		System.out.println();
		System.out.printf(player4 + " javelin thrown at %.2fM", result4);
		System.out.println();
		
		
	

    }
    
    
}