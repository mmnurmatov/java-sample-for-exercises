package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

       float sum = 1;

        for (int i = 2; i <= n; i++) {
            sum += 1 / (float)n;
        }

        System.out.println(" sum = " + sum);


    }
}
