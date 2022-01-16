package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arifmetik amalni ifodalovchi satrni kiriting:");
        String s = sc.nextLine();
        int summa = 0;
        String[] s1 = new String[s.length()];

        String satr = s;
        int n = s.indexOf('+');
        String s2 = s.substring(1, n + 1);

        System.out.println(s.replaceAll(s2, "u"));
        System.out.println(s.replaceAll("-", "u"));




    }
}