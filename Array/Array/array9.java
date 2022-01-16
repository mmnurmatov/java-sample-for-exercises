package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int soni = 0;
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
        System.out.println("Massivni juft elementlari indeksi kamayish tartibda ko'rinishi");
        for (int i = n - 1; i >= 0; i--) {
            if(a[i] % 2 == 0) {
                System.out.print(a[i] + "  ");
                soni++;
            }
        }
        System.out.println("");
        System.out.println("Massivning juft elementlari soni = " + soni);

    }
}
