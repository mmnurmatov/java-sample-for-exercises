package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix35 {
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


        for (int j = 0; j < n; j++) {
          int  toq_soni = 0;
            for (int i = 0; i < m; i++) {
                if (a[i][j] % 2 == 1) toq_soni++;
            }
            if (toq_soni == m) {
                System.out.println(j + " ustun elementlari faqat toq sonlardan tashkil topgan");
                return;
            }
        }

            System.out.println("Bunday ustun yo'q");
    }
}
