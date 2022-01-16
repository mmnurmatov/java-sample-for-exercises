package booleans;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean18 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Uchta son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        boolean g = (a == b || b == c || c == a);

        System.out.println(g);
    }
}
