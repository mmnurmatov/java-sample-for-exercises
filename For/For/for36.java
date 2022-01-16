package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ikkita butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("k = ");
        int k = sc.nextInt();

        int sum  = 0;

        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= k; j++) {
                a *= i;
            }
            sum += a;
        }

        System.out.println("Summa = "  + sum);
    }


}
