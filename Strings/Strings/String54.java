package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        char [] a = s.toCharArray();

        int soni = 0;

        for (int i = 0; i < a.length; i++) {

                    for (int j = 0; j < 26; j++) {
                        if ((int)a[i] == (65 + j))
                        {
                            soni++;
                        }
                    }
        }

        s = new String(a);
        System.out.println("Kiritilgan satr:  " + s);
        System.out.println("Satrdagi katta harflar soni = " + soni);
    }
}