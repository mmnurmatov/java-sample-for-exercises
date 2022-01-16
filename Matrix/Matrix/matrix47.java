package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix47 {
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

        do{
            System.out.println("\n\nAlmashishi lozim bo'lgan satrlarni nomerini kiriting:");
            System.out.print("k1 = ");
            k1 = sc.nextInt();
            System.out.print("k2 = ");
            k2 = sc.nextInt();
        } while (!(0 <= k1 && k1 < k2 && k2 < m));

        System.out.println("\nNatija:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k1)
                {
                    b[i][j] = a[k2][j];
                }
                else if (i == k2)
                {
                    b[i][j] = a[k1][j];
                }
                else
                {
                    b[i][j] = a[i][j];
                }
            }
        }

        a = b;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
