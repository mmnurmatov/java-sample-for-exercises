package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();

        float a[][] = new float[m][n];

        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextFloat();
                        //(float)(Math.random()*20 + 4);
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

        boolean bor;

        for (int i = 0; i < m; i++) {
            int musbat_soni = 0, manfiy_soni = 0;
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0) musbat_soni++;
                else
                    manfiy_soni++;
            }
            if (musbat_soni == manfiy_soni) {
                System.out.println(i + " satrning musbat va manfiy elementlari soni teng: ");
                return;
            }
        }

            System.out.println("Bunday satr yo'q");
    }
}
