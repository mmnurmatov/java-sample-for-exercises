package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix46 {
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
        boolean bor = false;
        int max, min;
        int index = 0;
        for (int i = 0; i < m; i++) {
            max = 0; min = 1000000000;
            for (int j = 0; j < n; j++) {
                if (max <= a[i][j])
                {
                    max = a[i][j];
                    index = j;
                }
            }

            for (int k = 0; k < m; k++) {
                if (min >= a[k][index])
                {
                    min = a[k][index];
                }
            }

            if(min == max)
            {
                bor = true;
                System.out.println("O'zi turgan satrda eng kattasi va o'zi turgan ustunda eng kichkinasi bo'lgan element = " + max);
            }
        }
        if (bor == false)
        System.out.println(0);
    }
}
