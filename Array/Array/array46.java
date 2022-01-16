package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("r = ");
        int r = sc.nextInt();
        boolean b = true;
        int min = 0, min1 = 0, min2 = 0;


        System.out.println("Massiv elementlarini kiriting:");

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        System.out.println("Massivning dastlabki ko'rinishi ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("");
        System.out.println("Natija:");

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (b)
                {
                    min = Math.abs((a[i] + a[j]) - r);
                    min1 = a[i];
                    min2 = a[j];
                    b = false;
                }
                else if (min >= Math.abs((a[i] + a[j]) - r)) {
                    min = Math.abs((a[i] + a[j]) - r);
                    min1 = a[i];
                    min2 = a[j];
                }
            }
        }

        System.out.println("Massivning " + r + " soniga yig'indisi eng yaqin bo'ladigan ikkita elementlari: " + min1 + " va " + min2);
    }
}
