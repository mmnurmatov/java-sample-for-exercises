package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, min = 0, mini = 0, max = 0, maxi = 0;

            System.out.println("Massivlar o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        max = min = a[0];

        for (int i = 1; i < n; i++) {

            if (min > a[i])
            {
                min = a[i];
                mini = i;
            }
            if (max < a[i])
            {
                max = a[i];
                maxi = i;
            }
        }


        int temp = a[maxi];
        a[maxi] = a[mini];
        a[mini] = temp;

        System.out.println("");
        System.out.println("Natija");

        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}