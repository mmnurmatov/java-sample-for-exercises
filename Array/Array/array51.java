package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array51 {
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

        System.out.println("\nb - massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a -  massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("\nHosil bo'lgan b -  massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }

    }
}