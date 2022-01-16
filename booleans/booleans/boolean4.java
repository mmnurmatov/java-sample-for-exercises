package booleans;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Sonlar kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        boolean g = a > 2 && b <= 3;

        System.out.println(g);
    }
}
