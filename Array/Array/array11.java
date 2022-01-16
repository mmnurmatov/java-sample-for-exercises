package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        do {
            System.out.println("Massiv o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();
            System.out.print("k = ");
            k = sc.nextInt();
        }while (!(1 <= k && k < n));

            int[] a = new int[n];

        System.out.println("Massiv elementlarini kiriting:");

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        System.out.println("Massivning dastlabki ko'rinishi ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("");
        System.out.println("Natija:");
        for (int i = k; i < n; i += k) {
                System.out.print(a[i] + "  ");
        }

    }
}
