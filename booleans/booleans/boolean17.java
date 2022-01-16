package booleans;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean17 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();

        boolean g = (a > 99 && a < 1000) && a % 2 == 1;

        System.out.println(g);
    }
}
