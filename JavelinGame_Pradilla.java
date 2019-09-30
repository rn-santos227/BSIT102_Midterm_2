import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class JavelinGame_Pradilla {
    
    public static void main(String[] args) throws IOException {
    	
    	DataInputStream ey = new DataInputStream(System.in);
    	DecimalFormat df = new DecimalFormat("#.##");
    	
    	Random rn = new Random ();
    	double min = 50.0;
    	double max = 130.0;
    	double throw1 = 20.00;
    	
    	double rnValue = min + (max - min) = rn.nextDouble();
    	double rnValuee = min + (max - min) = rn.nextDouble();
    	double rnValueee = min + (max - min) = rn.nextDouble();
    	double rnValueeee = min + (max - min) = rn.nextDouble();
    	
        System.out.print("Enter Player 1 name: ";)
        String fp = ey.readLine();
        
        System.out.print("Enter Player 2 name: ");
        String sp = ey.readLine();
       
        System.out.print("Enter Player 3 name: ");
        String tp = ey.readLine();
        
        System.out.print("Enter Player 4 name: ");
        String lp = ey.readLine();
      
        System.out.print("Player 1:" +fp+" thrown at "+ df.fromat(rnValue += throw1) + "M");
        System.out.print("Player 2:" +sp+" thrown at "+ df.fromat(rnValuee += throw1) + "M");
        System.out.print("Player 3:" +tp+" thrown at "+ df.fromat(rnValueee += throw1) + "M");
        System.out.print("Player 4:" +lp+" thrown at "+ df.fromat(rnValueeee += throw1) + "M");
        
    }
}