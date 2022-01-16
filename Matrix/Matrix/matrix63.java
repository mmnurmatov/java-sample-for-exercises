package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix63 {
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
        int  b[][] = new int[m - 1][n];
        //int  b[][] = new int[m][n];
        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt(); //(int)(Math.random()*20 + 4);
            }
        }

        int min = 1000000000, index = 0;
        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (min >= a[i][j])
                {
                    min = a[i][j];
                    index = i;
                }
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }




        int z = 0;
        for (int i = 0; i < m; i++) {
                if (i == index)
                {
                    continue;
                }

                    for (int j = 0; j < n; j++) {
                        b[z][j] = a[i][j];
                    }
                    z++;
        }

        a = b;

        System.out.println("\nMatrixni eng kichik elementi = " + min + " \nVa uning turgan satr indeksi = " + index);

        System.out.println("\nNatija");
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
