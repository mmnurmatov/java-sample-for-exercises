package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();



        int sum = 0, kop = 1;

        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(Math.random()*20 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\n(0 <= k < m) oraliqda satrni tanlang: \nk = ");
        int k = sc.nextInt();

        for (int j = 0; j < n; j++) {
            sum += a[k][j];
            kop *= a[k][j];
        }

        System.out.println("Summa = " + sum);
        System.out.println("Ko'paytma yig'indi = " + kop);

    }
}
