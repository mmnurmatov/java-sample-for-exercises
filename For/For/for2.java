package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 01.11.2015.
 */
public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ikkita butun son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println(a + " va " + b  + " sonlar orasidagi butun sonlar ");

        for (int i = a; i <= b; i++) {
            System.out.print( i + " ");
        }
        System.out.println("");
        System.out.println("Va shu butun sonlar soni = " + (b - a + 1));


    }
}
