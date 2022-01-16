package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int [n];
        int[] b = new int [n];
        int k = -1;
        boolean bor;

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Hosil bo'lgan massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {

            if (1 > a[i] || a[i] > n) {
                System.out.println(i + " indeksdagi element qonuniyatni buzgan ");
                return;
            }

            bor = false;

            for (int j = 0; j <= k; j++) {

                if (a[i] == b[j]) {
                    bor = true;
                    System.out.println(i + " indeksdagi element qonuniyatni buzgan ");
                    return;
                }

            }

            if (bor == false) {
                b[++k] = a[i];
            }
        }

        System.out.println("");
        System.out.println("Natija");
        System.out.println(0);
    }
}