package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        String [] s1 = s.split(" ");

        int max = 0;
        for (int i = 0; i < s1.length; i++) {

            if (max <= s1[i].length()) {
                max = s1[i].length();
            }
        }

        System.out.println("Satrdagi eng katta so'z uzunligi = " + max);

    }
}