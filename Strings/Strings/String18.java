package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();
        String s1 = new String();
        char[] a = s.toCharArray();
        char[] z = new char[200];
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            if ((int)a[i] >= 65 && (int)a[i] <= 96)
            {
                s1 += a[i];
                System.out.print(s1.toLowerCase());
                char[] c = s1.toCharArray();
                for (int j = 0; j < c.length; j++) {
                   z[k++] = c[j];
                }
                s1 = "";
            }
            else if ((int)a[i] >= 97 && (int)a[i] <= 122)
            {
                s1 += a[i];
                s1.toUpperCase();
                char[] b = s1.toCharArray();
                for (int j = 0; j < b.length; j++) {
                    z[k++] = b[j];
                }
                s1 = "";
            }
        }

        s = new String(z);
        System.out.print("\nNatijaviy satr:  " + s);

    }
}