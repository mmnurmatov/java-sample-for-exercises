package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("(-1 < x < 1) x = ");
        float x = sc.nextFloat();

        float surat = x;
        float sum = 0;
        int ishora = -1;

        for (int i = 1; i <= n; i++) {
            ishora *= -1;
            surat *=  x;
            sum += ishora * surat / i;
        }

        System.out.println("summa = " + sum);
    }
}
