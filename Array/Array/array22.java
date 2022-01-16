package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l, soni = 0;
        do {
            System.out.println("Massiv o'lchamini kiriting:");
            System.out.print("n = ");
            n = sc.nextInt();
            System.out.print("k = ");
             k = sc.nextInt();
            System.out.print("l = ");
             l = sc.nextInt();

        } while (!(0 <= k && k <= l && l < n));
        int summa = 0;
        int[] a = new int[n];

        System.out.println("Massiv elementlarini kiriting:");

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        System.out.println("Massivning dastlabki ko'rinishi ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        int i;
        System.out.println("");
        System.out.println("Natija:");

        for (i = k; i <= l; i++) {
            soni++;
            summa += a[i];
        }
        
        summa /= soni;
        System.out.println("Massivning " + k + "  va  " + l + " indekslari orasidagi elementlar yig'indisining o'rta arifmetigi:");
        System.out.println("summa = " + summa);

    }
}
