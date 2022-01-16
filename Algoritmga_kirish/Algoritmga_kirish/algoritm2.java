package Algoritmga_kirish;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 24.12.2015.
 */
public class algoritm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n=");
        int n = sc.nextInt();
        float[] a = new float[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextFloat();
        }

        System.out.println("Dastlabki massiv");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i] > a[j])
                {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nSaralangan massiv");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }



    }
}
