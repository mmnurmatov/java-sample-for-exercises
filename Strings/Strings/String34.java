package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrlarni kiriting:");
        System.out.print("s1 = ");
        String s1 = sc.nextLine();
        System.out.print("s2 = ");
        String s2 = sc.nextLine();


        if (s1.contains(s2) == true)
        {
            int n = s1.lastIndexOf(s2);
            s1 = s1.substring(0, n)+ s1.substring(n + s2.length());
        }
        System.out.println(s1);
    }
}