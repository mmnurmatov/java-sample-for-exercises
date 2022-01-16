package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        do {
            System.out.println("Matrixni satr uzunligini kiriting:");
            System.out.print("m=");
            m = sc.nextInt();
            System.out.println("Matrixni ustun uzunligini kiriting:");
            System.out.print("n=");
            n = sc.nextInt();
        } while (m % 2 == 1);
        int  a[][] = new int[m][n];
        int  b[][] = new int[m][n];
        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt(); //(int)(Math.random()*20 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        int k1 = m / 2;
        int k2 = 0;
        while (k2 < m / 2)
        {
            for (int j = 0; j < n; j++) {
                b[k2][j] = a[k1][j];
                b[k1][j] = a[k2][j];
            }
            k1++;
            k2++;
        }


        a = b;
        System.out.println("\nNatija");

        for (int  i = 0;  i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
