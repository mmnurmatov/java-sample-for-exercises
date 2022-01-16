package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix30 {
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

        System.out.println("\nNatija:");
        System.out.println("Har bir ustunda elementlarining o'rta arifmetigidan katta elementlar sonlari:");

        for (int j = 0; j < n; j++) {

            float arif = 0;
            int soni = 0;

            for (int i = 0; i < m; i++) {
                arif += a[i][j];
            }

            arif /= m;

            for (int i = 0; i < m; i++) {
                if (arif < a[i][j])
                {
                    soni++;
                }
            }

            System.out.println(j + " -> " + soni);
        }

    }
}
