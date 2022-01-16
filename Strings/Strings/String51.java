package Strings;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        String s1 = new String();

        s = "";

        for (int i = 0; i < a.length; i++) {
            if(a[i] != ' ')
            {
                s1 += a[i];
            }
            else
            {
                if (s1.isEmpty() == false)
                {
                    s += s1 + " ";
                }
                s1 = "";
            }
        }

        String[] names = s.split(" ");

        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[i].compareTo(names[j])>0) {
                    String t = names[i];
                    names[i] = names[j];
                    names[j] = t;
                }
            }
        }

        s = "";
        for (int i = 0; i < names.length; i++) {
           s += names[i] + " ";
        }
        System.out.println(s);
    }
}