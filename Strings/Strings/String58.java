package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        int n = s.lastIndexOf('\\');
        s = s.substring(n + 1, s.indexOf('.', n + 1));

        System.out.println("Fayl nomi: " + s);

    }
}