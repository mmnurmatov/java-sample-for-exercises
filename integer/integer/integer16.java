package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikki xonali son kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();
        int b = a / 100;
        int c = (a / 10) % 10;
        int d = a % 10;

        System.out.println(a + " sonning birliklar va o'nliklar xonasini almashtirishdan hosil bo'lgan son " + ((b * 100) + (d * 10) + c) + " ga teng");
    }
}
