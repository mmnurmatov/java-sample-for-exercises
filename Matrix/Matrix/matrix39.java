package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix39 {
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

        int ustunlar_soni = 0;
        for (int j = 0; j < n; j++) {
            int soni = 0;
            for (int i = 0; i < m - 1; i++) {
                for (int k = i + 1; k < m; k++) {

                    if (a[i][j] == a[k][j]) soni++;
                }
            }
            if (soni == 0)
                ustunlar_soni++;
        }



        if(ustunlar_soni != 0)
        System.out.println("Elementlari har xil bo'lgan ustunlar soni = " + ustunlar_soni);
        else
            System.out.println("Bunday ustunlar yo'q");

    }
}
