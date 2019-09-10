import java.util.Random;
import java.util.Scanner;

// CREATED BY NICOLE C. ERASGA BSIT - 102 
public class JavelinGame
{
	public static void main (String [] args)
	{
		Scanner PlayerName = new Scanner(System.in);
		
		// Input Player Name Here:
		String Player1,Player2,Player3,Player4;	
		System.out.print("What is Player 1 name:? ");
		Player1=PlayerName.nextLine();
		System.out.print("What is Player 2 name:? ");
		Player2=PlayerName.nextLine();
		System.out.print("What is Player 3 name:? ");
		Player3=PlayerName.nextLine();
		System.out.print("What is Player 4 name:? ");
		Player4=PlayerName.nextLine();
			
		// Random with Min and Max
		Random nicsRandom = new Random();
		int rangeMin = 50;
		int rangeMax = 130;
		
		// Randomize the throw
		double RandomThrow1,RandomThrow2,RandomThrow3,RandomThrow4;
		RandomThrow1 = rangeMin + (rangeMax - rangeMin) * nicsRandom.nextDouble();  
	 	RandomThrow2 = rangeMin + (rangeMax - rangeMin) * nicsRandom.nextDouble();
		RandomThrow3 = rangeMin + (rangeMax - rangeMin) * nicsRandom.nextDouble();
		RandomThrow4 = rangeMin + (rangeMax - rangeMin) * nicsRandom.nextDouble();
		
		// Format Double to 2 decimal points
		double InitialDistance = 20;		
		String RandomFormat1,RandomFormat2,RandomFormat3,RandomFormat4;
		RandomFormat1 = String.format("%.2f" , RandomThrow1 += InitialDistance );
		RandomFormat2 = String.format("%.2f" , RandomThrow2 += InitialDistance);
		RandomFormat3 = String.format("%.2f" , RandomThrow3 += InitialDistance );
		RandomFormat4 = String.format("%.2f" , RandomThrow4 += InitialDistance);
		
		// Print the output of 4 players
		System.out.println("Player 1: " +Player1 + " throws at " + RandomFormat1  +" meters");
		System.out.println("Player 2: " +Player2 + " throws at " + RandomFormat2  +" meters");
		System.out.println("Player 3: " +Player3 + " throws at " + RandomFormat3  +" meters");
		System.out.println("Player 4: " +Player4 + " throws at " + RandomFormat4  +" meters");
				
	}	
}