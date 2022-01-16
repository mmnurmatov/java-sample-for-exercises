package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2*n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nb -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("\nHosil bo'lgan b - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }

        int soni = 0;
        int k = 0;
        if (a[0] > b[0]) soni = 1;

        for (int i = 0; i  < 2*n; i ++) {

            if (soni == 0)
            {
                c[i] = a[k++];
                if (k == n)
                {
                    soni = 1;
                    k = 0;
                }
            }
            else {
                c[i] = b[k++];
                if (k == n)
                {
                    soni = 0;
                    k = 0;
                }
            }

        }

        System.out.println("");
        System.out.println("Natija");

        System.out.println("\nc - massiv ko'rinishi");
        for (int i = 0; i < 2*n; i++) {
            System.out.print(c[i] + "  ");
        }
    }
}