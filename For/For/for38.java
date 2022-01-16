package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ikkita butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int sum  = 0;
        int p = n;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = p; j >= 1; j--) {
                a *= i;
            }
            p--;
            sum += a;
        }

        System.out.println("Summa = "  + sum);
    }


}
