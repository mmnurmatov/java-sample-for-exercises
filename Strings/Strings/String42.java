package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();

        if (s.contains(" ") == true) {

            int fromIndex = -1;
            int count = 0;
            int soni = 0;
            s += " ";
            while((fromIndex = s.indexOf(" ", fromIndex + 1)) != -1)
            {
                if (s.charAt(count) == s.charAt(fromIndex  - 1)) soni++;
                count = fromIndex + 1;
            }
            System.out.println("Bir xil harflar bilan boshlanuvchi va tugovchi so'zlar soni = " + soni);
        }
        else
        {
            s = "";
            System.out.print(s);
        }

    }
}