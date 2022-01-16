package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("(-1 < x < 1) x = ");
        float x = sc.nextFloat();

        float sum  = x;
        float surat = 1;
        float d = x;
        float maxraj = 1;

        for (int i = 1; i <= n; i++) {

            d *= x * x;
            surat *= 2 * i - 1;
            maxraj *= 2 * i;

            sum += (d * surat) / (maxraj * (2 * n + 1));

        }

        System.out.println("summa = "  + sum);
    }
}
