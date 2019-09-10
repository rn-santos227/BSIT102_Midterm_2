/*
 *Justin M Bajaro
 *BSIT102
 *TP
 */
import java.util.Scanner;
import java.util.Random;
public class Justin {
   
    public static void main(String[] args) throws Exception {


    Scanner sc = new Scanner(System.in);

    Random rnd = new Random();
    int rangeMin = 50;
    int rangeMax = 130; 

    double ran1,ran2,ran3,ran4;
    String Play1,Play2,Play3,Play4;
    String form1,form2,form3,form4;


    ran1 = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();
    ran2 = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();
    ran3 = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();
    ran4 = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();

    form1 = String.format("%.2f", ran1 + 20);
    form2 = String.format("%.2f", ran2 + 20);
    form3 = String.format("%.2f", ran3 + 20);
    form4 = String.format("%.2f", ran4 + 20);

    System.out.println("Player 1: " + Play1 + " throws " + form1 + "m");
    System.out.println("Player 2: " + Play2 + " throws " + form2 + "m");
    System.out.println("Player 3: " + Play3 + " throws " + form3 + "m");
    System.out.println("Player 4: " + Play4 + " throws " + form4 + "m");

     }

}



            