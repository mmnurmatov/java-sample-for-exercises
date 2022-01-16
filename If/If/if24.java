package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("x = ");
        float x = sc.nextFloat();

        if (x > 0)
        {
            System.out.println("2 * sin(x) = " + (2 * Math.sin(x)));
        }
        else
            System.out.println("x - 6 = " + (x - 6));


    }
}
