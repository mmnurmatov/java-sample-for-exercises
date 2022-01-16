package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m, k;

    do {
        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();
        System.out.print("k = ");
        k = sc.nextInt();

    } while (!(0 <= k && k < n));

        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(Math.random()*10 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nNatijaviy matrix");


            for (int i = 0; i < m; i++) {
                System.out.print(a[i][k] + "\t");
            }



    }
}
