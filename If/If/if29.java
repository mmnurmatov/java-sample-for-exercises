package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("x = ");
        int x = sc.nextInt();

        if (x > 0)
        {
            if (x % 2 == 0)
                System.out.println("Musbat juft son");
            else
                System.out.println("Musbat toq son");
        }
        else
            if (x < 0)
            {
                if (x % 2 == 0)
                    System.out.println("Manfiy juft son");
                else
                    System.out.println("Manfiy toq son");
            }
        else
                System.out.println("Nolga teng");


    }
}
