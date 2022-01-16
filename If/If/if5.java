package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if5 {
    public static void main(String[] args) {

        System.out.println("Uchta butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        int k = 0;
        if (a > 0) k++;
        if (b > 0) k++;
        if (c > 0) k++;

        if(k == 0)
            System.out.println("Musbat son yo'q");
        else
        System.out.println("Musbat sonlar soni = " + k);
        if (k == 3)
            System.out.println("Manfiy son yo'q");
        else System.out.println("Manfiy sonlar soni = " + (3 - k));
    }
}
