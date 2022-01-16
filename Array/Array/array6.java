package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Ikkita butun son kiriting:");
        System.out.print("a = ");
        int x = sc.nextInt();
        System.out.print("b = ");
        int y = sc.nextInt();


        int[] a = new int[n];
        a[0] = x;
        a[1] = y;
        a[2] =  a[0] + a[1];
        for (int i = 3; i < n; i++) {

            a[i] = a[i - 1] * 2;
        }

        System.out.println("Hosil bo'lgan ketma-ketlik ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

    }
}
