package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
            System.out.println("Massiv o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();

        int[] a = new int[n];
        int soni = 0;


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


        for (int i = 0; i < n - 1; i++) {

            if (!(a[i] > a[i + 1])) {
                soni++;
            }
        }

        if (a[n - 2] >= a[n - 1]) soni++;
        System.out.println("Massivning monoton kamayuvchi oraliqlar soni = " + soni);
    }
}
