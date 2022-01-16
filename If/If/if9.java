package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if9 {
    public static void main(String[] args) {

        System.out.println("Ikkita butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        float a = sc.nextFloat();

        System.out.print("B = ");
        float b = sc.nextFloat();

        System.out.println("Natija");
        if (a < b)
        {
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            return;
        }
        else
        {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }
}
