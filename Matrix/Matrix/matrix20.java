package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();


        int a[][] = new int[m][n];
        int b[] = new int [m];

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
        int k = 0;
        for (int j = 0; j < n; j++) {
            int kop = 1;
            for (int i = 0; i < m; i++) {
                kop *= a[i][j];
            }
            b[k++] = kop;
        }

        System.out.println("------------------------------------");
        System.out.println("Har bir ustun elementlarining ko'paytmasi");
        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + "\t");
        }
    }
}
