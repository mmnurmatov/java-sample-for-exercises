package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Massivlar o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();
        }while (n % 2 == 1);

        int[] a = new int[n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        int k = n / 2, g = n / 2;
        for (int i = 0; i < k; i++) {

            int temp = a[i];
            a[i] = a[g];
            a[g] = temp;
            g++;
        }

        System.out.println("");
        System.out.println("Natija");

        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}