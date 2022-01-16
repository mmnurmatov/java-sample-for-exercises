package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if20 {
    public static void main(String[] args) {

        System.out.println("Nuqtalar koordinatalarini kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        float a = sc.nextFloat();

        System.out.print("B = ");
        float b = sc.nextFloat();

        System.out.print("C = ");
        float c = sc.nextFloat();

        System.out.println("Natija");

       if (Math.abs(a - b) > Math.abs(a - c))
       {
           System.out.println(a + " nuqtaga eng yaqin nuqta " + c);
           System.out.println(" va ular orasidagi masofa " + Math.abs(a - c));
       }
        else
       {
           System.out.println(a + " nuqtaga eng yaqin nuqta " + b);
           System.out.println(" va ular orasidagi masofa " + Math.abs(a - b));
       }

    }
}
