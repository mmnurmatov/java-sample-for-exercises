package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix57 {
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
        } while (n % 2 == 1 && m % 2 == 1);
        int  a[][] = new int[m][n];
        int  b[][] = new int[m][n];
        //int  b[][] = new int[m][n];
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
        int k2;
        int k3 = 0;
        int k4;

        for (int i = 0; i < m / 2; i++) {
            k2 = n / 2; k4 = 0;
            for (int j = 0; j < n / 2; j++) {

                b[k3][k4] = a[k1][k2];
                b[k1][k2] = a[k3][k4];
                b[k3][k2] = a[k3][k2];
                b[k1][k4] = a[k1][k4];
                k2++;
                k4++;
            }
            k1++;
            k3++;
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
