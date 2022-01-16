package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if19 {
    public static void main(String[] args) {

        System.out.println("To'rtta butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        System.out.print("D = ");
        int d = sc.nextInt();

        System.out.println("Natija");

       if (a == b && b == c) {
           System.out.println(4);
       }
        else if (a == b && b == d) {
           System.out.println(3);
       }
       else if (a == c && c == d) {
           System.out.println(2);
       }
        else
       { System.out.println(1);}

    }
}
