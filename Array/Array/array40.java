package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("r = ");
        int r = sc.nextInt();
        int min = 0, min1 = 0;


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

        min = Math.abs(a[0] - r);
        min1 = a[0];
        for (int i = 1; i < n; i++) {

            if (min > Math.abs(a[i] - r)) {
                min = Math.abs(a[i] - r);
                min1 = a[i];
            }
        }

        System.out.println("Massivning " + r + " soniga eng yaqin soni  " + min1);
        System.out.println("Va ular orasidagi masofa = " + min);
    }
}
