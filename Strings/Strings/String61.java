package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();

        int n = s.lastIndexOf("\\");
        int m = s.lastIndexOf("\\", s.lastIndexOf("\\", n - 3));


        s = s.substring(m + 1, n - 1);

        if ((s.lastIndexOf("\\") > s.length()) || (s.lastIndexOf("\\", n - 2) > s.length()))
        {
            System.out.print("\\");
        }

            System.out.println("Satrdan birinchi katalog nomi: " + s);






    }
}