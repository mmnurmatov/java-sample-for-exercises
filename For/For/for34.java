package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        float a1 = 1;
        float a2 = 2;
        float a = 0;

        System.out.print(a1 + "    " + a2);
        for (int i = 3; i <= n; i++) {

            a = (a1 + 2 * a2) / 3;
            a1 = a2;
            a2 = a;
            System.out.print( "     " + a);
        }


    }


}
