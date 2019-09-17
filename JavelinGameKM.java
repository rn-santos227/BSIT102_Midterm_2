/**
 * @(#)JavelinGameKM.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;

public class JavelinGameKM {

    public static void main (String []args) {
    	
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Enter your name Player1");
    	String Player1 = scan.nextLine ();
    	System.out.println("Enter your name Player2");
    	String Player2 = scan.nextLine ();
    	System.out.println("Enter your name Player3");
    	String Player3 = scan.nextLine ();
    	System.out.println("Enter your name Player4");
    	String Player4 = scan.nextLine ();
    	
    	DecimalFormat a = new DecimalFormat ("#.00");
    	
    	double Min = 50.00;
    	double Max = 150.00;
    	double p = (Math.random()*((Max-Min)+1))+Min;
    	double s = (Math.random()*((Max-Min)+1))+Min;
    	double k = (Math.random()*((Max-Min)+1))+Min;
    	double u = (Math.random()*((Max-Min)+1))+Min;
    	
    	System.out.println();
    	System.out.println("Player 1: " + Player1 + " thrown the javelin at " + a.format(p) + "meters.");
    	System.out.println("Player 2: " + Player2 + " thrown the javelin at " + a.format(s) + "meters.");
    	System.out.println("Player 3: " + Player3 + " thrown the javelin at " + a.format(k) + "meters.");
    	System.out.println("Player 4: " + Player4 + " thrown the javelin at " + a.format(u) + "meters.");
    }
    
    
}