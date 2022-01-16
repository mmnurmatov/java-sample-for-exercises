package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, min = 0;
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

        System.out.println("");
        System.out.println("Natija:");

        min = a[0];

        for (int i = 2; i < n; i += 2) {

            if (min > a[i])
            min = a[i];
            }

        System.out.println("Massivning juft indeksli elementlarining minimum elementi min = " + min);
    }
}
