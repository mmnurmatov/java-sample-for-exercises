package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

            System.out.println("Massivlar o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();

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
        b[g++] = a[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[g++] = a[i];
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