package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

            System.out.println("Matrixni satr uzunligini kiriting:");
            System.out.print("m=");
            m = sc.nextInt();
            System.out.println("Matrixni ustun uzunligini kiriting:");
            System.out.print("n=");
            n = sc.nextInt();

        int  a[][] = new int[m][n];
        int  b[][] = new int[m][n];

        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt(); //int)(Math.random()*20 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
                b[i][j] = a[i][j];
            }

            System.out.println();
        }

                    if (b[0][0] > b[1][0] && b[0][0] > b[0][1])
                        a[0][0] = 0;

                    if (b[m - 1][n - 1] > b[m - 2][n - 1] && b[m - 1][n - 1] > b[m - 1][n - 2])
                       a[m - 1][n - 1] = 0;


                    if (b[0][n - 1] > b[0][n - 2] && b[0][n - 1] > b[1][n - 1])
                        a[0][n - 1] = 0;


                    if(b[m - 1][0] > b[m - 2][0] && b[m - 1][0] > b[m - 1][1])
                        a[m - 1][0] = 0;


        for (int j = 1; j < n - 1; j++) {
            if (b[0][j] > b[0][j + 1] && b[0][j] > b[1][j] && b[0][j] > b[0][j - 1])
                a[0][j] = 0;
        }
        for (int j = 1; j < n - 1; j++) {
           if (b[m - 1][j] > b[m - 1][j + 1] && b[m - 1][j] > b[m - 2][j] && b[m - 1][j] > b[m - 1][j - 1])
               a[m - 1][j] = 0;
        }
        for (int i = 1; i < m - 1; i++) {
             if (b[i][0] > b[i + 1][0] && b[i][0] > b[i - 1][0] && b[i][0] > b[i][1])
                 a[i][0] = 0;
        }
        for (int i = 1; i < m - 1; i++) {
            if (b[i][n - 1] > b[i + 1][n - 1] && b[i][n - 1] > b[i - 1][n - 1] && b[i][n - 1] > b[i][n - 2])
                a[i][n - 1] = 0;
        }

        for (int i = 1; i < m - 1; i++) {

            for (int j = 1; j < n - 1; j++) {

                if (b[i][j] > b[i + 1][j] && b[i][j] > b[i][j + 1] && b[i][j] > b[i][j - 1] && b[i][j] > b[i - 1][j])
                    a[i][j] = 0;
            }
        }


        System.out.println("\nNatija");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
