package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        float[] b = new float[n];
        float sum = 0, s = 0;

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
            sum += a[i];
        }

        for (int i = 0; i < n; i++) {

                b[i] = (sum - s) / (n - i);
                s += a[i];
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }
    }
}