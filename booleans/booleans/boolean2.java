package booleans;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();

        boolean b = a % 2 != 0;

        System.out.println(b);
    }
}
