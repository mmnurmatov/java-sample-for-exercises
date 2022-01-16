package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Massiv elementlarini kiriting:");

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        System.out.println("Massivning dastlabki ko'rinishi ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        int i;
        System.out.println("");
        System.out.println("Natija:");

        for (i = 0; i <= n - 2; i++) {

            if (a[i] < a[n - 1]) {
                System.out.println("Massivning oxirgi elementidan kichkina birinchi elementi:");
                System.out.println(a[i]); break;
            }
        }

        if (i == n - 1)
        System.out.println(0);

    }
}
