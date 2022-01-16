package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To'g'ri to'rtburchakning tomonlarini kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("Kvadratning tomonini kiriting:");
        System.out.println("c=");
        int c = sc.nextInt();

        int x = (a / c) * (b / c);

        System.out.println("To'g'ri to'rtburchakka eng ko'pi bilan " + x + " ta kvadratlar bilan joylashtirish mumkin");
        System.out.println("Va joylashmay qolgan qismining yuzasi s = " + (a * b - x * (c * c)));

    }
}
