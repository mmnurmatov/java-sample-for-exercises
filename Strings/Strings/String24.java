package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun musbat sonni ifodalovchi o'nlik sanoq sistemasidagi son satrini kiriting:");
        String s = sc.nextLine();
        char [] b = new char[100];
        int k = 0;
        int a = Integer.parseInt(s);
        System.out.print(s + " -> satrni ikkilik sanoq sistemasidagi qiymati: -> ");
        while (a >= 1)
        {
            if (a % 2 == 1)
            b[k++] += '1';
            else
            b[k++] += '0';
            a /= 2;
        }

        String z = new String(b);
        z = z.trim();

        char[] c = z.toCharArray();

        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }

        z = new String(c);
        System.out.println(z);
    }
}