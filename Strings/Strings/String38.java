package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrlarni kiriting:");
        System.out.print("s1 = ");
        String s1 = sc.nextLine();
        System.out.print("s2 = ");
        String s2 = sc.nextLine();
        System.out.print("s3 = ");
        String s3 = sc.nextLine();

        String satr = new String();
        if (s1.contains(s2) == true) {

            int fromIndex = -1;
            int count = 0;
            int n = 0;
            while((fromIndex = s1.indexOf(s2, fromIndex + 1)) != -1)
            {
                satr += s1.substring(count, fromIndex);
                satr += s3;
                count = fromIndex + s2.length();
                n = fromIndex;
            }
            satr += s1.substring(n + s2.length());
        }

        System.out.println(satr);
    }
}