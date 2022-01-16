package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tganini kiriting:");
        System.out.print("t = ");
        int t = sc.nextInt();

        int s = t / 3600;
        int m = (t - (s *3600)) / 60;

        t = t - (s *3600) - m * 60;

        System.out.println("Demak kun boshidan boshlab " + s + (" soat va ") + m + " minut va " + t +  " sekund o'tdi");
    }
}
