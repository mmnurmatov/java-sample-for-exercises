package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k = 0;

            System.out.println("Massivlar o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1)
            {
                k = a[i];
            }
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
            if (a[i] % 2 == 1)
            a[i] += k;
        }


        System.out.println("");
        System.out.println("Natija");

        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}