package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        int m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        int n = sc.nextInt();

        int a[][] = new int [m][n];


        for (int i = 0; i < m; i++) {
            a[i][0] = (int)(Math.random()*10 + 4);
        }

        for (int j = 1; j < m; j++) {
            for (int i = 0; i < n; i++) {

                a[i][j] = a[i][0];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
