package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("x = ");
        float x = sc.nextFloat();

        int sum = 1;
        float sum1 = 1;
        float surat = 1;

        for (int i = 1; i <= n; i++) {

            sum *= i;
            surat *= x;
            sum1 += surat / sum;

        }

        System.out.println(" summa  = " + sum1);

    }
}
