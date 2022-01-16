package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

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

        int k = 0;

        for (int i = 0; i < n; i += 2) {
            b[k++] = a[i];
        }

        for (int i = 1; i < n; i += 2) {

            b[k++] = a[i];
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }
    }
}