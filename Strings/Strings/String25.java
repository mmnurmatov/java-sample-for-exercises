package Strings;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun musbat sonni ifodalovchi ikkilik sanoq sistemasidagi son satrini kiriting:");
        String s = sc.nextLine();
        System.out.print(s + " -> satrni o'nlik sanoq sistemasidagi qiymati: -> ");
        System.out.println(Integer.parseInt(s, 2));

    }
}