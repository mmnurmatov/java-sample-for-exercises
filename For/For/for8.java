package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ikita butun son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int sum = 1;

        for (int i = a; i <= b; i++) {
            sum *= i;
        }

        System.out.println(a + " dan " + b + " gacha sonlarning ko'paytmasi sum = " + sum);


    }
}
