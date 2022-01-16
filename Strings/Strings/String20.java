package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun musbat sonni ifodalovchi satrni kiriting:");
        String s = sc.nextLine();

        System.out.println("Satr belgilarini chapdan o'ngga qarab ko'rinishi:");
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }
}