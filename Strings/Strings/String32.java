package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrlarni kiriting:");
        System.out.print("s1 = ");
        String s1 = sc.nextLine();
        System.out.print("s2 = ");
        String s2 = sc.nextLine();
        int fromIndex = -1;
        int count = 0;

        //System.out.println(s1.contains(s2));

        while ((fromIndex = s1.indexOf(s2, fromIndex + 1)) != -1)
        {
            count++;
        }

        System.out.println(s1 + " satrda " + s2 + " satrni takrorlanishlar soni = " + count);

    }
}