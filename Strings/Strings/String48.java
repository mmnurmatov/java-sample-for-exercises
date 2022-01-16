package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        boolean bor = true;
        char n = 0;
        int count = 0;

        s = "";

        for (int i = 0; i < a.length; i++) {
            if(a[i] != ' ')
            {
                if (bor)
                {
                   n = a[i];
                   count = 1;
                   bor = false;
                }
                if (count == 1)
                {
                    count = 0;
                    continue;
                }
                if (n == a[i])
                {
                    a[i] = '.';
                }

            }
            else
            {
                bor = true;
            }
        }

        s = new String(a);

        System.out.println(s);

    }
}