package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();

        char[] a = s.toCharArray();
        s = "";

        for (int i = 0; i < a.length; i++) {

            s += a[i] + " ";
        }

        System.out.println(s);

    }
}