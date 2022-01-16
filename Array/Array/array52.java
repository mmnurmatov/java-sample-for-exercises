package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        float[] a = new float[n];
        float[] b = new float[n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextFloat();
        }

        System.out.println("\nHosil bo'lgan a -  massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
           if (a[i] < 5)
           {
               b[i] = 2 * a[i];
           }
            else{
               b[i] = a[i] / 2;
           }
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\na - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }

    }
}