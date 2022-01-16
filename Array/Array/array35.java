package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
            System.out.println("Massiv o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();

        int[] a = new int[n];
        int min = 0;
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


        for (int i = 1; i < n - 1; i++) {

            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                if (!lokal)
                {
                    min = a[i]; lokal = true;
                }
                else if (min > a[i])
                {
                    min = a[i];
                }

            }
        }

        System.out.print("Massivning elementlari orasidagi lokal maximum elementlarining kichigi min = " + min);
    }
}
