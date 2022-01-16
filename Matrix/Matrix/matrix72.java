package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;
        boolean bor = false;

            System.out.println("Matrixni satr uzunligini kiriting:");
            System.out.print("m=");
            m = sc.nextInt();
            System.out.println("Matrixni ustun uzunligini kiriting:");
            System.out.print("n=");
            n = sc.nextInt();

        int  a[][] = new int[m][n];
        int  b[][] = new int[m][];

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

        int index = 0;

        for (int j = 0; j < n; j++) {
            int soni = 0;
            for (int i = 0; i < m; i++) {
                if (a[i][j] > 0)
                {
                    soni++;
                }
            }
            if (soni == m)
            {
                index = j;
                bor = true;
                break;
            }
        }

        if (bor)
        {
            for (int i = 0; i < b.length; i++) {
                b[i] = new int[n + 1];
            }
        }
        else
        {
            for (int i = 0; i < m; i++) {
                b[i] = new int[n];
            }
        }

        int z = 0;
        for (int j = 0; j < n; j++) {

            if (bor) {
                if (j == index) {
                    for (int k = 0; k < m; k++) {
                        b[k][z] = 1;
                    }
                    z++;
                }
            }
            for (int i = 0; i < m; i++) {
                b[i][z] = a[i][j];
            }
            z++;
        }

        a = b;

        System.out.println("\nNatija");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
