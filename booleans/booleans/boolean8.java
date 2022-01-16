package booleans;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Uchta son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        boolean g = a % 2 == 1 && b % 2 == 1;

        System.out.println(g);
    }
}
