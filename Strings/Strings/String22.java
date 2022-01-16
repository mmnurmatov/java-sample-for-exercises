package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun musbat sonni ifodalovchi satrni kiriting:");
        String s = sc.nextLine();
        int summa = 0;
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            summa += a[i] - '0';
        }

        System.out.println(s + " satrni raqamlari yig'indisi = " + summa);
    }
}