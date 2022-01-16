package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if17 {
    public static void main(String[] args) {

        System.out.println("Uchta butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        System.out.println("Natija");

        if ((a < b && b < c) || (a > b && b > c))
        {
            System.out.println("a = " + (a *= 2));
            System.out.println("b = " + (b *= 2));
            System.out.println("c = " + (c *= 2));
        }
        else {
            System.out.println("a = " + (a *= -1));
            System.out.println("b = " + (b *= -1));
            System.out.println("c = " + (c *= -1));
        }

    }
}
