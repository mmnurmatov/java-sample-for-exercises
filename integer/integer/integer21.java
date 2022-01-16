package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tganini kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();
        int b = a / 60;
        int c = a % 60;

        System.out.println("Demak kun boshidan boshlab " + b + (" minut va ") + c + " sekund o'tgan ekan");
    }
}
