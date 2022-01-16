package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String37 {
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

        satr += s1.substring(0, s1.lastIndexOf(s2));
        satr += s3;
        satr += s1.substring(s1.lastIndexOf(s2) + s2.length());

        System.out.println(satr);
    }
}