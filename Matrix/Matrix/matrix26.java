package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();

        int a[][] = new int[m][n];

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


        int min = 1000000000;
        int index = 0;
        System.out.println("\nNatija:");
        for (int j = 0; j < n; j++) {
            int kop = 1;

            for (int i = 0; i < m; i++) {
                kop *= a[i][j];
            }

            if (min >= kop)
            {
                min = kop;
                index = j;
            }
        }

        System.out.println("Elementlari ko'paytmasi eng kichik ustun indeksi = " + index);
        System.out.println("Va uning elementlari ko'paytmasi = " + min);

    }
}
