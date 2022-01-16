package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int [n];

        a[0] = 1;

        for (int i = 1; i < n; i++) {

            a[i] = a[i - 1] * 2;
        }

        System.out.println("2 sonini dastlabki " + n  + " ta darajalari:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

    }
}
