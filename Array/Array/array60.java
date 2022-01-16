package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
            sum += a[i];
        }

        b[0] = sum;
        for (int i = 1; i < n; i++) {
                sum -= a[i - 1];
                b[i] = sum;
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }
    }
}