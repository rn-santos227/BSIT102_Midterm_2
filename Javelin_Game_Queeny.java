import java.io.*;
import java.util.Random;
import java.text.DecimalFormat;
 
public class Javelin_Game {
    
    public static void main(String[] args) throws IOException {
    
    	 	DataInputStream dat = new DataInputStream (System.in);
    	 	DecimalFormat df2 = new DecimalFormat ("#.##");
    	 	
    	 	double Min = 50.0;
    	 	double Max = 130.0;
    	 	double Throw1 = 20.0;
    	
    	 		Random r = new Random();
    	 		double random0 = Min + (Max - Min) * r.nextDouble();
    	 		double random1 = Min + (Max - Min) * r.nextDouble();
    	 		double random2 = Min + (Max - Min) * r.nextDouble();
    	 		double random3 = Min + (Max - Min) * r.nextDouble();
    		
    	 	System.out.println ("Input name for Player_1: ");
    	 	String Player_1 = dat.readLine();
    	 	
    	 	
    	 	System.out.println ("Input name for Player_2: ");
    	 	String Player_2 = dat.readLine();
    	 		
    	 		
    	 	System.out.println ("Input name for Player_3: ");
    	 	String Player_3 = dat.readLine();
    	 		
    	 		
    	 	System.out.println ("Input name for Player_4: ");
    	 	String Player_4 = dat.readLine();
    	 			
    	 	System.out.println("Player 1: "+Player_1 + " thrown at "  + df2.format(random0+=Throw1));
    		System.out.println("Player 2: "+Player_2 + " thrown at " + df2.format(random1+=Throw1));
    		System.out.println("Player 3: "+Player_3 + " thrown at " + df2.format(random2+=Throw1));
    		System.out.println("Player 4: "+Player_4 + " thrown at " + df2.format(random3+=Throw1));
    }
}	
