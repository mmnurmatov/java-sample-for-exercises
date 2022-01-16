package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        String s1 = new String();
        boolean bor = true;

        s = "";

        for (int i = 0; i < a.length; i++) {
            if(a[i] != ' ')
            {
                if (bor)
                {
                    for (int j = 0; j < 26; j++) {
                        if ((int)a[i] == (97 + j))
                        {
                            a[i] = (char)(65 + j);
                        }
                    }
                    bor = false;
                }
                s1 += a[i];
            }
            else
            {
                if (s1.isEmpty() == false)
                {
                    s += s1 + " ";
                    s1 = "";
                    bor = true;
                }
                else
                {
                    s += " ";
                }


            }
        }

        s += s1 + " ";
        System.out.println(s);
    }
}