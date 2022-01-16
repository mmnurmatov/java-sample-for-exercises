package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 01.11.2015.
 */
public class for7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Ikkita butun son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();


        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("summa = "  + sum);

    }
}