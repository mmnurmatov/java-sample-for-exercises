package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m, k1, k2;

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

        int min = 1000000000, max = 0;
        int index1 = 0, index2 = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {

                if(min >= a[i][j])
                {
                    min = a[i][j];
                    index1 = j;
                }
                if (max <= a[i][j])
                {
                    max = a[i][j];
                    index2 = j;
                }
            }
        }



        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {

             if (j == index1)
             {
                 b[i][j] = a[i][index2];
             }
              else if (j == index2)
             {
                 b[i][j] = a[i][index1];
             }
             else
             {
                 b[i][j] = a[i][j];
             }
            }
        }

        a = b;

        System.out.println("\nNatija");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n Matrixning eng katta elementi max = " + max);
        System.out.println("va u turgan ustun indeksi = " + index2);

        System.out.println("Matrixning eng kichik elementi min = " + min);
        System.out.println("va u turgan ustun indeksi = " + index1);
    }
}
