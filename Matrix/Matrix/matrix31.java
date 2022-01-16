package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix31 {
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
        float arif1 = 0;
        int index1 = 0, index2 = 0;
        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
                arif1 += a[i][j];
            }

            System.out.println();
        }
        arif1 /= m * n;
        System.out.println("\nNatija:");
        System.out.println("Har bir ustun elementlarining o'rta arifmetigi:");

        float min = 1000000000;

        for (int j = 0; j < n; j++) {

            float arif = 0;


            for (int i = 0; i < m; i++) {
                arif += a[i][j];
            }

            arif /= m;
            System.out.println(j + " ustun o'rta arifmetigi " + arif);

            if (min >= Math.abs(arif1 - arif))
            {
                min = Math.abs(arif1 - arif);
                index1 = j;
            }
        }

        System.out.println("\n Har bir satr elementlarining o'rta arifmetigi:");
        min = 1000000000;
        for (int i = 0; i < m; i++) {
            float arif = 0;

            for (int j = 0; j < n; j++) {
                arif += a[i][j];
            }

            arif /= n;
            System.out.println(i + " satr o'rta arifmetigi " + arif);

            if (min >= Math.abs(arif1 - arif))
            {
                min = Math.abs(arif1 - arif);
                index2 = i;
            }
        }

        System.out.println("Matrixning o'rta arifmetigi: = " + arif1);
        System.out.println("matrixning o'rta arifmetigiga eng yaqin bo'lgan ustun va satrning indekslari: " + index1 + "   " + index2);

    }
}
