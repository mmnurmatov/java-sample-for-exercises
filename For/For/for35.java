package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        float a1 = 1;
        float a2 = 2;
        float a3 = 3;
        float a = 0;

        System.out.print(a1 + "    " + a2 + "    " + a3);
        for (int i = 4; i <= n; i++) {

            a = a3 + a2 - 2 * a1;
            a1 = a2;
            a2 = a3;
            a3 = a;
            System.out.print( "     " + a);
        }


    }


}
