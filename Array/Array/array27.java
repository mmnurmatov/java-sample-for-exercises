package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, index = 0;
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

        for (int i = 1; i < n; i++) {
            if (!((a[i] * a[i - 1] * (-1)) == Math.abs((a[i] * a[i - 1]))))
            {
                index = i;
                System.out.println(" Ketma - ketlikni buzgan birinchi element indeksi = " + index);
                System.exit(0);
            }
        }

        System.out.println(0);
    }
}
