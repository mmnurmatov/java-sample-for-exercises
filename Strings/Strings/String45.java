package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        String [] s1 = s.split(" ");

        int min = s1[0].length();
        for (int i = 1; i < s1.length; i++) {

            if (min >= s1[i].length()) {
                min = s1[i].length();
            }
        }

        System.out.println("Satrdagi eng qisqa so'z uzunligi = " + min);

    }
}