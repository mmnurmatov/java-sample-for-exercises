package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m, k;

            System.out.println("Matrixni satr uzunligini kiriting:");
            System.out.print("m=");
            m = sc.nextInt();
            System.out.println("Matrixni ustun uzunligini kiriting:");
            System.out.print("n=");
            n = sc.nextInt();

        int  a[][] = new int[m][n];
        int  b[][] = new int[m][n - 1];
        //int  b[][] = new int[m][n];
        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt(); //(int)(Math.random()*20 + 4);
            }
        }

        int max = 0, index = 0;
        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (max <= a[i][j])
                {
                    max = a[i][j];
                    index = i;
                }
            }
        }


        int z = 0;
        for (int j = 0; j < n; j++) {
                if (j == index)
                {
                    continue;
                }

                    for (int i = 0; i < m; i++) {
                        b[i][z] = a[i][j];
                    }
                    z++;
        }

        a = b;

        System.out.println("\nMatrixni eng kichik elementi = " + max + " \nVa uning turgan ustun indeksi = " + index);

        System.out.println("\nNatija");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
