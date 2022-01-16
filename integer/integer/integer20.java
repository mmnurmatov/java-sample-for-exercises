package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tganini kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println("Demak kun boshidan boshlab " + (a / 3600) + " soat o'tgan ekan");
    }
}
