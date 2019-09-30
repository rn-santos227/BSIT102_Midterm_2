import java.util.*;
import java.text.*;

public class JavelineParado {

    public static void main(String[] args) {
        String player1,player2,player3,player4;
        Scanner scan = new Scanner(System.in);
        double max = 150;
        double min = 50;
        Random rand = new Random();
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Javelin Game");
        System.out.print("Please enter Player 1 Name: ");
        player1 = scan.nextLine();
        System.out.print("Please enter Player 2 Name: ");
        player2 = scan.nextLine();
        System.out.print("Please enter Player 3 Name: ");
        player3 = scan.nextLine();
        System.out.print("Please enter Player 4 Name: ");
        player4 = scan.nextLine();
        double first = rand.nextDouble() * (max - min) + min;
        System.out.println("Player 1: " + player1 + " throws at "  + formatter.format(first) + "m");
        double second = rand.nextDouble() * (max - min) + min;
        System.out.println("Player 2: " + player2 + " throws at "  + formatter.format(second) + "m");
        double third = rand.nextDouble() * (max - min) + min;
        System.out.println("Player 3: " + player3 + " throws at "  + formatter.format(third) + "m");
        double fourth = rand.nextDouble() * (max - min) + min;
        System.out.println("Player 4: " + player4 + " throws at "  + formatter.format(fourth) + "m");
    }
}