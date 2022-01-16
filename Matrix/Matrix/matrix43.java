package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix43 {
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

        System.out.println("\nNatija:");

        int soni;
        int ustunlar_soni = 0;
        for (int j = 0; j < n; j++) {
            soni = 0;
            for (int i = 0; i < m - 1; i++) {

                if(a[i][j] < a[i + 1][j])
                {
                    soni++;
                }
            }
            if (soni == 0)
            {
                ustunlar_soni++;
            }
        }

        System.out.println("\nElementlari kamayish tartibida berilgan ustunlar soni = " + ustunlar_soni);
    }
}
