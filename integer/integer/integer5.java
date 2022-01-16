package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikkita son kiriting:(A > B)");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.println(a + " kesmada " + b + " kesmani " + (a / b) + " marta joylashtirish mumkin");
        System.out.println(a + " kesmada " + b + " kesmani " + (a % b) + " qismi joylashmagan qismi");

    }
}
