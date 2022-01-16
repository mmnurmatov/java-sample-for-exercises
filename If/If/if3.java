package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if3 {
    public static void main(String[] args) {

        System.out.println("Butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        if (a > 0)
            System.out.print(++a);
        else if (a < 0)
            System.out.print(a = a - 2);
        else
            System.out.println(a = 10);

    }
}
