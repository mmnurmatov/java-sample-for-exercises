package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        n = sc.nextInt();

        int[] a = new int[n];
        int osuvchi = 0, kamayuvchi = 0;
        boolean osyapti = false;


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

            if (a[i] <= a[i + 1]) {
                if (osyapti != true && i != 0) {
                    kamayuvchi++;
                }
                osyapti = true;
            } else {
                if (osyapti != false && i != 0) {
                    osuvchi++;
                }
                osyapti = false;
            }

        }

        if (osyapti) {
            osuvchi++;
        } else {
            kamayuvchi++;
        }

        System.out.println("Massivning monoton kamayuvchi oraliqlar soni = " + kamayuvchi);
        System.out.println("Massivning monoton o'suvchi oraliqlar soni = " + osuvchi);
        System.out.println("Massivning monoton oraliqlar soni = " + (kamayuvchi + osuvchi));
    }
}
