import java.util.Scanner;

public class Javelin_Game_Berches
{
	private static Scanner sc;
	private static String name[] = new String[4];
	private static double dist[] = {20f, 20f, 20f, 20f};
    public static void main (String[]args)
    {
    	sc = new Scanner(System.in);
    	

		System.out.print("Input player 1 name: ");
		name[0] = sc.next();
		dist[0] +=  30 + (Math.random()*100);
		
		System.out.print("Input player 2 name: ");
		name[1] = sc.next();
		dist[1] +=  30 + (Math.random()*100);
		
		System.out.print("Input player 3 name: ") ;
		name[2] = sc.next();
		dist[2] +=  30 + (Math.random()*100);
		
		System.out.print("Input player 4 name: ");
		name[3] = sc.next();
		dist[3] +=  30 + (Math.random()*100);
    	
    	System.out.printf("Player 1: " + name[0] + " has thrown at %.2f m\n",  dist[0]);
    	System.out.printf("Player 2: " + name[1] + " has thrown at %.2f m\n",  dist[1]);
    	System.out.printf("Player 3: " + name[2] + " has thrown at %.2f m\n",  dist[2]);
    	System.out.printf("Player 4: " + name[3] + " has thrown at %.2f m\n",  dist[3]);
    }
}
