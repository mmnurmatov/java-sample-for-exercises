package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();
        System.out.print("Son kiriting: \nn=");
        int n = sc.nextInt();

        if (s.length() >= n)
        {
            s = s.substring(s.length() - n, s.length());
        }
        else
        {
            int a = s.length();
            for (int i = 0; i < n; i++) {
                s = '.' + s;
            }
        }
        System.out.println(s);

    }
}