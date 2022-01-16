package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikki xonali son kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();
        int b = a / 100;
        int c = (a / 10) % 10;
        int d = a % 10;

        System.out.println(a + " sonning raqamlarini teskari tartibda yozishdan hosil bo'lgan son " + ((d * 100) + (c * 10) + b) + " ga teng");
    }
}
