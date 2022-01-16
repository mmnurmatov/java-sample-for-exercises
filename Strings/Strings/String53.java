package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        char [] a = s.toCharArray();

        int soni = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == '.' || a[i] == '?' || a[i] == ',' || a[i] == '!')
            {
                soni++;
            }
        }

        s = new String(a);
        System.out.println("Kiritilgan satr: \n" + s);
        System.out.println("Satrdagi tinish belgilar soni = " + soni);
    }
}