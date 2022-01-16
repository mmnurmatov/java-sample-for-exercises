package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix77 {
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
        //int  b[][] = new int[m][n];

        System.out.println("Matritsa elementlarini kiriting:");

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



            for (int j = 0; j < n - 1; j++) {
                int g = j;
                for (int k = j + 1; k < n; k++) {
                    if (a[m - 1][j] < a[m - 1][k])
                    {
                        g = k;
                    }
                }
                    for (int i = 0; i < m; i++) {

                    int temp = a[i][j];
                    a[i][j] = a[i][g];
                    a[i][g] = temp;

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
