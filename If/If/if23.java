package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if23 {
    public static void main(String[] args) {
        float x = 0;
        float y = 0;
        System.out.println("To'g'ri to'rtburchakning uchta uchi koordinatasini kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.println(" A(x1;y1)");
        System.out.print("x1 = ");
        float x1 = sc.nextFloat();
        System.out.print("y1 = ");
        float y1 = sc.nextFloat();

        System.out.println(" B(x2;y2)");
        System.out.print("x2 = ");
        float x2 = sc.nextFloat();
        System.out.print("y2 = ");
        float y2 = sc.nextFloat();

        System.out.println(" C(x3;y3)");
        System.out.print("x3 = ");
        float x3 = sc.nextFloat();
        System.out.print("y3 = ");
        float y3 = sc.nextFloat();

        System.out.println("Natija");


      if (x1 == x2) x = x3;
       else if (x1 == x3) x = x2;
        else if (x2 == x3) x = x1;

        if (y1 == y2) y = y3;
        else if (y1 == y3) y = y2;
        else if (y2 == y3) y = y1;

        System.out.println("To'rtinchi nuqta koordinatalari");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
