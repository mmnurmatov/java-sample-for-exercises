package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("x = ");
        float x = sc.nextFloat();

        if (x < -2 || x > 2)
        {
            System.out.println("2 * x = " + (2 * x));
        }
        else
            System.out.println("-3 * x = " + (-3 * x));


    }
}
