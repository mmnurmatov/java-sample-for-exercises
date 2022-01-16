package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        float a = 1;

        for (int i = 1; i <= n; i++) {

            a = (a + 1) / i;

        }

        System.out.println("Natija = " + a);
    }


}
