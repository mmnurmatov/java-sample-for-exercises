package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

       float sum = 1;

        for (int i = 1; i <= n; i++) {
            float a = 1.1f;
            sum *= a;
            a += 0.1;
        }

        System.out.println(" sum = " + sum);


    }
}
