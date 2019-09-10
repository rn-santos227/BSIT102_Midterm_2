/**
 * @(#)JavelinGameNiPaolo.java
 *
 * JavelinGameNiPaolo application
 *
 * @author 
 * @version 1.00 2019/9/10
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;

public class JavelinGameNiPaolo {
    
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Player 1 = ");
    	String player1 = sc.nextLine();
    	System.out.print("Player 2 = ");
    	String player2 = sc.nextLine();
    	System.out.print("Player 3 = ");
    	String player3 = sc.nextLine();
    	System.out.print("Player 4 = ");
    	String player4 = sc.nextLine();
    	
  		DecimalFormat a = new DecimalFormat("#.00");
  		
  		double Min = 50.00;
  		double Max = 150.00;
  		double p = (Math.random()*((Max - Min)+1))+Min;
  		double s = (Math.random()*((Max - Min)+1))+Min;
  		double k = (Math.random()*((Max - Min)+1))+Min;
    	double u = (Math.random()*((Max - Min)+1))+Min;
    	
    	System.out.println();
		System.out.println("Player 1: " + player1 + " thrown the javelin at " + a.format(p) + " meters.");
		System.out.println("Player 2: " + player2 + " thrown the javelin at " + a.format(s) + " meters.");
		System.out.println("Player 3: " + player3 + " thrown the javelin at " + a.format(k) + " meters.");
		System.out.println("Player 4: " + player4 + " thrown the javelin at " + a.format(u) + " meters.");
    
    }
}
