package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
            System.out.println("Massiv o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();

        int[] a = new int[n];
        int max = 0;
        boolean lokal = false;

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

        System.out.println("Massivning lokal bo'lmagan elementlari:");
        System.out.print(a[0]);
        max = a[0];
        for (int i = 1; i < n - 1; i++) {

            if (!((a[i] > a[i - 1] && a[i] > a[i + 1]) || (a[i] < a[i - 1] && a[i] < a[i + 1]))) {

                lokal = true;

                if (max < a[i])
                {
                    max = a[i];
                    System.out.print("  " + a[i]);
                }
            }
        }

        if (max <  a[n - 1]) max = a[n - 1];
        System.out.print("  " + a[n - 1]);
        if (lokal)
        {
            System.out.println("");
            System.out.println("Massivning lokal bo'lmagan elementlarining kattasi max = " + max);
        }
        else {
            System.out.println("");
            System.out.println(0);
        }


    }
}
