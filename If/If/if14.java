package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if14 {
    public static void main(String[] args) {

        System.out.println("Uchta butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        int min;
        int max;

        System.out.println("Natija");

        min = (a > b) ? b : a;
        min = (min > c) ? c : min;
        max = (a > b) ? a : b;
        max = (max < c) ? c : max;

        System.out.println("Sonlarning eng kichigi min = " + min);
        System.out.println("Sonlarning eng kattasi max = " + max);

    }
}
