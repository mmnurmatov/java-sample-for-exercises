package booleans;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean9 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Uchta son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        boolean g = (a % 2 == 1 && b % 2 == 1) || (a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1);

        System.out.println(g);
    }
}
