package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();

        char a = s.charAt(0);
        char b = s.charAt(s.length() - 1);

        System.out.println("Satrning birinchi belgisini " + a + " va uning  kodi -> " + (int)a);
        System.out.println("Satrning oxirgi belgisini " + b + " va uning  kodi -> " + (int)b);
    }
}