package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        float[] a = new float[n];
        int k1 = 0, k2 = 0;

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
            if (a[i] >= 0) k1++;
            else k2++;
        }

        float[] b = new float[k1];
        float[] c = new float[k2];
         k1 = 0; k2 = 0;
        for (int i = 0; i < n; i++) {

                if (a[i] >= 0) {
                    b[k1++] = a[i];
                }
            else
                {
                    c[k2++] = a[i];
                }
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println("\nb - massiv elementlari soni = " + k1);
        System.out.println("\nb - massiv ko'rinishi");
        for (int i = 0; i < k1; i++) {
            System.out.print(b[i] + "  ");
        }

        System.out.println("\n\nc - massiv elementlari soni = " + k2);
        System.out.println("\nc - massiv ko'rinishi");
        for (int i = 0; i < k2; i++) {
            System.out.print(c[i] + "  ");
        }
    }
}