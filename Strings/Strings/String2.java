package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("32 < n <= 126 oraliqda son kiriting:\nn = ");
            n = sc.nextInt();
        } while (!(32 < n && n <= 126));

        System.out.println(n + " sonining ASCII kodidagi belgisi -> " + (char)n);

    }
}