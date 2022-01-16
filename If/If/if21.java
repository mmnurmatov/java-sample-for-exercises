package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if21 {
    public static void main(String[] args) {

        System.out.println("Nuqta koordinatalarini kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        float x = sc.nextFloat();

        System.out.print("y = ");
        float y = sc.nextFloat();

        System.out.println("Natija");

        if (x == 0 && y == 0)
            System.out.println(0);
        else if (y == 0 && x != 0)
        System.out.println(1);
        else if (x == 0 && y != 0)
            System.out.println(2);
        else
            System.out.println(3);
















    }
}
