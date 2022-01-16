package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikkita satrni kiriting:");
        System.out.print("s1=");
        String s1 = sc.nextLine();
        System.out.print("s2=");
        String s2 = sc.nextLine();
        int n1, n2;

        do {
            System.out.println("Ikkita son kiriting:");
            System.out.println("n1 = ");
            n1 = sc.nextInt();
            System.out.println("n2 = ");
            n2 = sc.nextInt();

        } while ((!(1 <= n1 && n1 <= s1.length()) && (1 <= n2 && n2 <= s2.length())));



            s2 = s2.substring(s2.length() - n2, s2.length());
            s1 = s1.substring(0, n1);

            s1 = s1.concat(s2);

        System.out.println("\nNatija:   " + s1);
    }
}