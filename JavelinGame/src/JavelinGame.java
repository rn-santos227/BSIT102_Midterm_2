/**
 * @(#)JavelinGame.java
 *
 * JavelinGame application
 *
 * @author 
 * @version 1.00 2019/9/10
 */
 import java.util.Scanner;
 import java.lang.Math;
 import java.util.Random;
 import java.text.DecimalFormat;
 
public class JavelinGame {
    

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter your name Player1");
    	String Player1 = scan.nextLine();
    	System.out.println("Enter your name Player2");
    	String Player2 = scan.nextLine();
    	System.out.println("Enter your name Player3");
    	String Player3 = scan.nextLine();
    	System.out.println("Enter your name Player4");
    	String Player4 = scan.nextLine();
    	
    	DecimalFormat d = new DecimalFormat("#.00");
    	
    	double minrange = 50.00;
    	double maxrange = 150.00;
    	double w = (Math.random()*((maxrange - minrange)+1))+minrange;
    	double x = (Math.random()*((maxrange - minrange)+1))+minrange;
    	double y = (Math.random()*((maxrange - minrange)+1))+minrange;
    	double z = (Math.random()*((maxrange - minrange)+1))+minrange;
    	
	System.out.println();
	
	System.out.println("Player1: " + Player1 + " thrown the javelin at " + d.format(w) + " meters.");
	System.out.println("Player2: " + Player2 + " thrown the javelin at " + d.format(x) + " meters.");
	System.out.println("Player3: " + Player3 + " thrown the javelin at " + d.format(y) + " meters.");
	System.out.println("Player4: " + Player4 + " thrown the javelin at " + d.format(z) + " meters.");
    }
}
