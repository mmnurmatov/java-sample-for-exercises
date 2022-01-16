package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();

        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '.' || a[i] == '?' || a[i] == ',' || a[i] == '!' || a[i] == ' ')
            {
                continue;
            }
            else
            {
                if (a[i] == 'z' || a[i] == 'Z')
                {
                    int b = (int)a[i] - 25;
                    char n = (char)b;
                    a[i] = n;
                }
                else
                {
                    int c = (int)a[i] + 1;
                    char m = (char)c;
                    a[i] = m;
                }
            }
        }

        s = new String(a);
        System.out.println(s);

    }
}