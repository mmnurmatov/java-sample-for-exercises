package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String50 {
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
                    char[] b = s1.toCharArray();
                    for (int j = 0; j < b.length / 2; j++) {
                        char temp = b[j];
                        b[j] = b[b.length - j - 1];
                        b[b.length - j - 1] = temp;
                    }

                    s1 = new String(b);

                    s += s1 + ' ';
                }
                s1 = "";
            }
        }

        System.out.println(s);
    }
}