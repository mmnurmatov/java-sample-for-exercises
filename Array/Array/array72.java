package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, h;
        do {
            System.out.println("Massivlar o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();
            System.out.print("k = ");
            k = sc.nextInt();
            System.out.print("h = ");
            h = sc.nextInt();
        } while (!(1 <= k && k < h && h <= n));

        int[] a = new int[n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        int x = (h - k + 1) / 2;
        for (int i = 0; i < x; i++) {

            int temp = a[k];
            a[k] = a[h];
            a[h] = temp;
            k++;
            h--;
        }

        System.out.println("");
        System.out.println("Natija");

        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}