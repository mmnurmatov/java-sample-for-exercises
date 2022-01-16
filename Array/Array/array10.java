package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

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
        for (int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                System.out.print(a[i] + "  ");
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if(a[i] % 2 == 1) {
                System.out.print(a[i] + "  ");
            }
        }
    }
}
