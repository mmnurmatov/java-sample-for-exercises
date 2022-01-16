package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int m;

            System.out.println("Matrixni satr uzunligini kiriting:");
            System.out.print("m=");
            m = sc.nextInt();

        int  a[][] = new int[m][m];
        //int  b[][] = new int[m][n];

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

        int summa = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == m - 1)
                    summa += a[i][j];
            }
        }


        System.out.println("\nNatija");
        System.out.println("Matrixni yordamchi dioganali elementlari yig'indisi = " + summa);
    }
}
