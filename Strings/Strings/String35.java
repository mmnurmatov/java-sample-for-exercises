package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrlarni kiriting:");
        System.out.print("s1 = ");
        String s1 = sc.nextLine();
        System.out.print("s2 = ");
        String s2 = sc.nextLine();
        String s3 = new String();

        if (s1.contains(s2) == true)
        {
            int fromIndex = -1;
            int count = 0;
            s1 = s1.concat(s2);
            while ((fromIndex = s1.indexOf(s2, fromIndex + 1)) != - 1)
            {

                s3 += s1.substring(count, fromIndex);
                count = fromIndex + s2.length();
            }

        }
        System.out.println(s3);
    }
}