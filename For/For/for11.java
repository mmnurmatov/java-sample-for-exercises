package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

       int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (n + i) * (n + i);
        }

        System.out.println(" sum = " + sum);


    }
}
