package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix1 {
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
            for (int j = 0; j < n; j++) {

                a[i][j] = i  * 10;
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
