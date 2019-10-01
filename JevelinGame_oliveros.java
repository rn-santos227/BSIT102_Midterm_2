
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;

public class JevelinGame_oliveros {

    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter your Player 1 name:");
    	String P1 = sc.nextLine();
    	System.out.println("Enter your Player 2 name:");
    	String P2 = sc.nextLine();
    	System.out.println("Enter your Player 3 name:");
    	String P3 = sc.nextLine();
    	System.out.println("Enter your Player 4 name:");
    	String P4 = sc.nextLine();
    	
    	DecimalFormat d = new DecimalFormat("#.00");
    	
    	double minrange = 50.00;
    	double maxrange = 150.00;
    	double w = (Math.random()*((maxrange - minrange)+1))+minrange;
    	double x = (Math.random()*((maxrange - minrange)+1))+minrange;
    	double y = (Math.random()*((maxrange - minrange)+1))+minrange;
    	double z = (Math.random()*((maxrange - minrange)+1))+minrange;
    
    	System.out.println();
    	
    	System.out.println("Player 1: " + P1 + "thrown the javelin at" + d.format(w) + "meters.")
    		System.out.println("Player 2: " + P2 + "thrown the javelin at" + d.format(w) + "meters.")
    			System.out.println("Player 3: " + P3 + "thrown the javelin at" + d.format(w) + "meters.")
    				System.out.println("Player 4: " + P4 + "thrown the javelin at" + d.format(w) + "meters.")
    	
    }
}
