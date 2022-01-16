package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();

        char[] a = s.toCharArray();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' &&  a[i] <= 'Z')
            {
                count++;
            }
        }

        s = new String(a);
        System.out.println(s + " satrda katta lotin harflar soni = " + count);

    }
}