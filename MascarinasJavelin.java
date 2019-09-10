import java.util.Scanner;
import java.util.Random;
public class MascarinasJavelin {
    
    public static void main(String[] args) {
    	String player1,player2,player3,player4;
    	Scanner names = new Scanner(System.in);
    	
    	Random jvlthrw = new Random();
    	double a = 50 + (150 - 50)* jvlthrw.nextDouble();
    	double b = 50 + (150 - 50)* jvlthrw.nextDouble();
    	double c = 50 + (150 - 50)* jvlthrw.nextDouble();
    	double d = 50 + (150 - 50)* jvlthrw.nextDouble();
    	
    	System.out.println("Player1: ");
    	player1 = names.nextLine();
    	System.out.println("Player2: ");
    	player2 = names.nextLine();
    	System.out.println("Player3: ");
    	player3 = names.nextLine();
    	System.out.println("Player4: ");
    	player4 = names.nextLine();
    	
    	System.out.println(player1 + " throws at " + String.format("%.2f", a) + " meters");
    	System.out.println(player2 + " throws at " + String.format("%.2f", b) + " meters");
    	System.out.println(player3 + " throws at " + String.format("%.2f", c) + " meters");
    	System.out.println(player4 + " throws at " + String.format("%.2f", d) + " meters");
    }
}
