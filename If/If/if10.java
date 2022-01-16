package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if10 {
    public static void main(String[] args) {

        System.out.println("Ikkita butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.println("Natija");
        if (a != b)
        {
            System.out.println("A = " + (a + b));
            System.out.println("B = " + (a + b));
        }
        else
        {
            System.out.println("A = " + (a = 0));
            System.out.println("B = " + (b = 0));
        }


    }
}
