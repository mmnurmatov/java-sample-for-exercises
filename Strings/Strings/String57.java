package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String57 {
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
                    s += s1 + ' ';
                }
                s1 = "";
            }
        }

        System.out.println(s);
    }
}