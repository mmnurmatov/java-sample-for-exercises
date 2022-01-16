package For;


import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("x = ");
        float x = sc.nextFloat();
        double pi = Math.atan(1)*4;

        int maxraj;
        float sum = 0;
        x *= pi / 180;
        float surat = 1;
        float ishora = 1;
        sum = x;
        for (int i = 3; i <= n; i = i + 2) {

            maxraj = 1;
            surat = 1;
            ishora *= - 1;
            for (int j = 1; j <= i; j++) {
                maxraj *= j;
                surat *= x;
            }

            sum += ishora * surat / maxraj;

        }

        System.out.println(" summa  = " + sum);

    }
}
