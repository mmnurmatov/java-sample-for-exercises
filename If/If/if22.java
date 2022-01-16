package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if22 {
    public static void main(String[] args) {

        System.out.println("Nuqta koordinatalarini kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        float x = sc.nextFloat();

        System.out.print("y = ");
        float y = sc.nextFloat();

        System.out.println("Natija");

        if (x > 0 && y > 0)
            System.out.println("Birinchi chorakda joylashgan");
        else if (x < 0 && y > 0)
            System.out.println("Ikkinchi chorakda joylashgan");
        else if (x < 0 && y < 0)
            System.out.println("Uchinchi chorakda joylashgan");
        else System.out.println("To'rtinchi chorakda joylashgan");
















    }
}
