package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix54 {
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

        int soni;
        int index = 0;
        boolean bor = false;
        for (int j = 0; j < n - 1; j++) {
            soni = 0;
            for (int i = 0; i < m; i++) {
                if (a[i][j] < 0)
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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (bor)
                {
                    if (j == n - 1)
                    {
                        b[i][j] = a[i][index];
                    }
                    else if (j == index)
                    {
                        b[i][j] = a[i][n - 1];
                    }
                    else
                    {
                        b[i][j] = a[i][j];
                    }
                }
            }
        }

        a = b;
        System.out.println("\nNatija");

        for (int  i = 0;  i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        if (bor)
        System.out.println("\nFaqat manfiy elementlardan tashkil topgan eng birinchi ustun indeksi = " + index);
        else
            System.out.println("\nElementlari faqat manfiy elementlardan tashkil topgan ustun yo'q");

    }
}
