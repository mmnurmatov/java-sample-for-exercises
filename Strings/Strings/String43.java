package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        String s1 = new String();

        if (s.contains(" ") == true) {

            int fromIndex = -1;
            int count = 0;
            int soni = 0;
            int n = 0;
            while((fromIndex = s.indexOf(" ", fromIndex + 1)) != -1)
            {
                n = fromIndex;
                s1 = s.substring(count, fromIndex - 1);
                if (s1.contains("A") == true)
                {
                    soni++;
                }
                count = fromIndex + 1;
            }
            s1 = s.substring(n + 1);
            if (s1.contains("A") == true)
            {
                soni++;
            }
            System.out.println("Kamida bitta A harfi bor so'zlar soni = " + soni);
        }
        else
        {
            s = "";
            System.out.print(s);
        }

    }
}