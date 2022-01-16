package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       do {
           System.out.println("Massivlar o'lchamini kiriting:");
           System.out.print("n = ");
           n = sc.nextInt();
       }while (!(n <= 15));
            int[] a = new int[n];
            int soni = 0;

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");

        }

        soni = n / 3 - 1;

        int[] b = new int[soni];
        int k = 0;
        for (int i = 3; i < n; i += 3) {
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