import java.text.*;
import java.util.*;
import java.io.*;

public class Javelin_game
{
   
    public static void main(String[] args)throws IOException
    {
    DataInputStream dis = new DataInputStream(System.in);
    DecimalFormat df2 = new DecimalFormat("#.##");
    Random ran = new Random();
    double min = 50.0;
    double max = 130.0;
    double throw1 = 20.0;
   
    double firstr = min+(max-min) *ran.nextDouble();
    double Secondr = min+(max-min) *ran.nextDouble();
    double Thirdr = min+(max-min) *ran.nextDouble();
    double fourthr = min+(max-min) *ran.nextDouble();
   
    System.out.println("Player 1: Enter yourname: ");
    String fp = dis.readLine();
    System.out.println("Player 2: Enter yourname: ");
    String sp = dis.readLine();
    System.out.println("Player 3: Enter yourname: ");
    String tp = dis.readLine();
    System.out.println("Player 4: Enter yourname: ");
    String ftp = dis.readLine();
   
    System.out.println("Player 1: "+fp+" thrown at "+df2.format(firstr+=throw1));
    System.out.println("Player 2: "+sp+" thrown at "+df2.format(Secondr+=throw1));
    System.out.println("Player 3: "+tp+" thrown at "+df2.format(Thirdr+=throw1));
    System.out.println("Player 4: "+ftp+" thrown at "+df2.format(fourthr+=throw1));
   
   
    }
}