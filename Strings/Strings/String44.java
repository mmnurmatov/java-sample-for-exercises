package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        int satr_soni = 0;
        String [] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            int soni = 0;

            char [] a = s1[i].toCharArray();

            for (int j = 0; j < a.length; j++) {
                if ((int)a[j] == 65)
                {
                    soni++;
                }
            }

            if (soni == 3)
            {
                satr_soni++;
            }
        }

        System.out.println("Satrda aniq 3 ta A harfi bor satrlar soni = " + satr_soni);
    }
}