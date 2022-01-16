package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("1 <= n <= 26 oraliqda son kiriting:\nn = ");
            n = sc.nextInt();
        } while (!(1 <= n && n <= 26));

        int kod = 65;
        for (int i = 0; i < n; i++) {
            System.out.print((char)kod + " ");
            kod++;
        }

    }
}