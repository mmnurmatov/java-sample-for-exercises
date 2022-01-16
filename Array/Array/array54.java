package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int soni = 0;

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) soni++;
        }

        int[] b = new int[soni];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
            b[k++] = a[i];
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\nb massivning elementlari soni = " + soni);
        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < soni; i++) {
            System.out.print(b[i] + "  ");
        }
    }
}