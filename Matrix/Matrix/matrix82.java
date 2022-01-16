package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int m, summa = 0;

            System.out.println("Matrixni satr uzunligini kiriting:");
            System.out.print("m=");
            m = sc.nextInt();

        int  a[][] = new int[m][m];
        int k = m - 1;

        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int)(Math.random()*20 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();
        for (int p = 0; p < 2 * m - 1; p++) {
            summa = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {

                    if (i + k == j)
                    {
                        summa += a[i][j];
                    }
                }
            }
            k--;
            System.out.println(p + " - chi dioganal elementlari yig'indisi = " + summa);
        }

    }
}
