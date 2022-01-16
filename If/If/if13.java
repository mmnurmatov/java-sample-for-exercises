package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if13 {
    public static void main(String[] args) {

        System.out.println("Uchta butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();
        int min;

        System.out.println("Natija");

        if (a > b && b > c || c > b && b > a)
        System.out.println("Uchta sonning o'rtachasi  = " + b);
        if (b > c && c > a ||a > c && c > b)
            System.out.println("Uchta sonning o'rtachasi  = " + c);
        if (b > a && a > c || c > a && a > b)
            System.out.println("Uchta sonning o'rtachasi  = " + a);

    }
}
