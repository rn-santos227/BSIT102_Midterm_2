//Jake Janhael Hapita

import java.util.Scanner;
import java.util.Random;

public class javelinGameJake
{
   
    public static void main(String[] args)
    {
    	
	    Scanner dis = new Scanner(System.in);
	    Random ran = new Random();
	    double min = 50.0;
	    double max = 130.0;
	    double throwss = 20.0;
	   
	    double random1 = min+(max-min) *ran.nextDouble();
	    double random2 = min+(max-min) *ran.nextDouble();
	    double random3 = min+(max-min) *ran.nextDouble();
	    double random4 = min+(max-min) *ran.nextDouble();
	   
	    System.out.println("Player 1: Enter yourname: ");
	    String p1 = dis.nextLine();
	    System.out.println("Player 2: Enter yourname: ");
	    String p2 = dis.nextLine();
	    System.out.println("Player 3: Enter yourname: ");
	    String p3 = dis.nextLine();
	    System.out.println("Player 4: Enter yourname: ");
	    String p4 = dis.nextLine();
	   
	    System.out.printf("\n Player 1: "+p1+" thrown at " + String.format("%.2f", random1+=throwss));
	    System.out.printf("\n Player 2: "+p2+" thrown at " + String.format("%.2f", random2+=throwss));
	    System.out.printf("\n Player 3: "+p3+" thrown at " + String.format("%.2f", random3+=throwss));
	    System.out.printf("\n Player 4: "+p4+" thrown at " + String.format("%.2f", random4+=throwss));
	   
   
    }
}
