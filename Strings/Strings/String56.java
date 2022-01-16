package Strings;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        s += " ";
        char [] a = s.toCharArray();
        String satr = new String();
        String s1 = new String();
        int soni = 0;

        int min = 1000000000;

        for (int i = 0; i < a.length; i++) {

              if (a[i] != ' ')
              {
                  soni++;
                  s1 += a[i];
              }
            else{
                  if (soni != 0)
                  {
                      if (min >= soni)
                      {
                          min = soni;
                          satr = s1;
                      }
                  }
                  s1 = "";
                  soni = 0;
              }
        }

        s = new String(a);
        System.out.println("Kiritilgan satr:  " + s);
        System.out.println("Satrdagi eng oxirgi qisqa so'z = " + satr);
    }
}