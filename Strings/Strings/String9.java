package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrlarni kiriting:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s1.concat(s2));

    }
}