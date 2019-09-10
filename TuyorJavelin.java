import java.util.Random;
import java.util.Scanner;
public class TuyorJavelin {
    
    public static void main(String[] args) throws Exception{
    	Scanner input = new Scanner(System.in);
    	Random rand =new Random();
        String Player1;
        String Player2;
        String Player3;
        String Player4;
        double rangeMin=50;
        double rangeMax=150;
        double a= 50 +(rangeMax - rangeMin) * rand.nextDouble();
        double b= 50 +(rangeMax - rangeMin) * rand.nextDouble();
        double c= 50 +(rangeMax - rangeMin) * rand.nextDouble();
        double d= 50 +(rangeMax - rangeMin) * rand.nextDouble();
    	System.out.println("Enter Player 1: ");
    	Player1=input.nextLine();
    	System.out.println("Enter Player 2: ");
    	Player2=input.nextLine();
    	System.out.println("Enter Player 3: ");
    	Player3=input.nextLine();
    	System.out.println("Enter Player 4: ");
    	Player4=input.nextLine();
       
    	System.out.printf("Player 1: "+Player1 +" Has trown from %.2f %n",a);
    	System.out.printf("Player 2: "+Player2 +" Has trown from %.2f %n",b);
    	System.out.printf("Player 3: "+Player3 +" Has trown from %.2f %n",c);
    	System.out.printf("Player 4: "+Player4 +" Has trown from %.2f %n",d);
    }
}
