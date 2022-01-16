package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("r = ");
        int r = sc.nextInt();
        int min = 0, min1 = 0, min2 = 0;


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

        min = Math.abs((a[0] + a[1]) - r);
        min1 = a[0];
        min2 = a[1];
        for (int i = 2; i < n - 1; i++) {

            if (min >= Math.abs((a[i] + a[i - 1]) - r)) {
                min = Math.abs((a[i] + a[i - 1]) - r);
                min1 = a[i - 1];
                min2 = a[i];
            }
        }

        System.out.println("Massivning " + r + " soniga yig'indisi eng yaqin bo'ladigan ikkita elementlari: " + min1 + " va " + min2);
    }
}
