package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();
        System.out.print("n = ");
        int n = sc.nextInt();
        char[] a = s.toCharArray();
        s = "";

        for (int i = 0; i < a.length - 1; i++) {

            s += a[i];
            for (int j = 0; j < n; j++) {
                s += "*";
            }
        }

        s += a[a.length - 1];

        System.out.println(s);

    }
}