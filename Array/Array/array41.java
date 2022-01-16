package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        n = sc.nextInt();

        int[] a = new int[n];
        int max = 0, max1 = 0, max2 = 0;


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

        max = a[0] + a[1];
        max1 = a[0];
        max2 = a[1];
        for (int i = 1; i < n - 1; i++) {

            if (max <= (a[i] + a[i + 1])) {
                max = a[i]+ a[i + 1];
                max1 = a[i];
                max2 = a[i + 1];
            }
        }

        System.out.println("Massivning yig'indisi eng katta bo'ladigan ikkita elementlari: " + max1 + " va " + max2);
        System.out.println("Va ularning yig'indisi = " + max);
    }
}
