package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; i++) {

            a[i] = a[i - 2] + a[i - 1];
        }

        System.out.println("Hosil bo'lgan Fibonanchi ketma-ketligi ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

    }
}
