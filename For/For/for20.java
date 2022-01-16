package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int sum = 1;
        int sum1 = 0;

        for (int i = 1; i <= n; i++) {

            sum *= i;
            System.out.println(i +  " != " + sum);
            sum1 += sum;
        }

        System.out.println("n! summa  = " + sum1);

    }
}
