package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();

        if (s.contains(" ") == true) {

            int fromIndex = -1;
            int count = 0;

            while((fromIndex = s.indexOf(" ", fromIndex + 1)) != -1)
            {
                count++;
            }

            if (count >= 2)
            {
                s = s.substring(s.indexOf(" "), s.lastIndexOf(" "));
                System.out.println("Birinchi va oxirgi probellar orasidagi belgilar:   " + s);
            }

        }
        else
        {
            s = "";
            System.out.print(s);
        }

    }
}