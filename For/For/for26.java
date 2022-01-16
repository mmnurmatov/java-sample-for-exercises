package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("(-1 < x < 1) x = ");
        float x = sc.nextFloat();

        float surat = 1;
        float sum = x;
        int ishora = 1;

        for (int i = 3; i <= n; i += 2) {
            ishora *= -1;
            surat = 1;
            for (int j = 1; j <= i; j++) {
                surat *=  x;
            }
            sum += ishora * surat / i;
        }

        System.out.println("summa = " + sum);
    }
}
