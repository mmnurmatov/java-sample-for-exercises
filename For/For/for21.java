package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int sum = 1;
        float sum1 = 1;

        for (int i = 1; i <= n; i++) {

            sum *= i;
            System.out.println(i +  " != " + sum);
            sum1 += 1 / (float)sum;
        }

        System.out.println(" summa  = " + sum1);

    }
}
