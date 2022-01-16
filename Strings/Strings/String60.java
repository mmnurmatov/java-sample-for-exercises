package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();

        int n = s.indexOf("\\");
        int m = s.indexOf("\\", s.indexOf("\\", n + 3));


        s = s.substring(n + 2, m);

        if ((s.indexOf("\\") > s.length()) || (s.indexOf("\\", n + 1) > s.length()))
        {
            System.out.print("\\");
        }

            System.out.println("Satrdan birinchi katalog nomi: " + s);






    }
}