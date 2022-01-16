package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        do {
            System.out.println("Massivlar o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();
            System.out.print("k = ");
            k = sc.nextInt();
        } while (!(1 <= k && k < n));
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        int g = 0;
        for (int i = k; i < n; i++) {
            b[g++] = a[i];
        }

        for (int i = 0; i < k; i++) {

            b[g++] = 0;
        }

        a = b;
        System.out.println("");
        System.out.println("Natija");

        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}