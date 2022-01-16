package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int [n];
        int[] b = new int [n];
        boolean bor;
        int k = 0;

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Hosil bo'lgan massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        b[0] = 0;
        for (int i = 0; i < n; i++) {

            bor = false;
            for (int j = 0; j < k; j++) {
                if (a[i] == b[j])
                {
                    bor = true;
                    break;
                }
            }
            if (bor == false)
                b[k++] = a[i];
        }

        System.out.println("");
        System.out.println("Natija");

        a = b;

        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + "  ");
        }


    }
}