package Array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int [n];

        int soni = 1, max = 0;

        System.out.println("Massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Hosil bo'lgan massiv ko'rinishi");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        for (int i = 0; i < n - 1; i++) {

                if (a[i] == a[i + 1])
                {
                    soni++;
                }
                else
                {
                    if (max <= soni) {

                        max = soni;
                        soni = 1;
                    }
                }
        }

        if (max < soni) max = soni;

        System.out.println("");
        System.out.println("Natija");

        System.out.println("Massivning elementlari orasida eng ko'p qatnashgan element = " + max);
    }
}