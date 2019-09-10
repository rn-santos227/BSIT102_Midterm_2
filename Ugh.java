import java.util.Scanner;
import java.util.Random; 
public class Ugh 
{
    
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	Random rand = new Random();
    	int rangeMin = 50;
    	int rangeMax = 130;
    	
    	double ran1,ran2,ran3,ran4;
    	int distance = 20;
    	String Play1,Play2,Play3,Play4;
    	String form1,form2,form3,form4;
    	
    	ran1 = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
    	ran2 = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
    	ran3 = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
    	ran4 = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
    	
    	form1 = String.format("%.2f" , ran1 += distance);
    	form2 = String.format("%.2f" , ran2 += distance);
    	form3 = String.format("%.2f" , ran3 += distance);
    	form4 = String.format("%.2f" , ran4 += distance);
    	
    	System.out.println("Player 1 name: ");
    	Play1 = sc.nextLine();
    	System.out.println("Player 2 name: ");
    	Play2 = sc.nextLine();
    	System.out.println("Player 3 name: ");
    	Play3 = sc.nextLine();
    	System.out.println("Player 4 name: ");
    	Play4 = sc.nextLine();
    	
    	System.out.println("Player 1: " + Play1 + " throws the javelin at " + form1 + " meters");
    	System.out.println("Player 2: " + Play2 + " throws the javelin at " + form2 + " meters");
    	System.out.println("Player 3: " + Play3 + " throws the javelin at " + form3 + " meters");
    	System.out.println("Player 4: " + Play4 + " throws the javelin at " + form4 + " meters");
    }
}
