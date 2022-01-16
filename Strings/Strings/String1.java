package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Belgilar satrini kiriting:");
        String s = sc.next() ;

        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " belgini ASCII kodi -> " + (int)a[i]);
        }


    }
}