package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int ishora = 1;

       float sum = 0;
        float a = 1.1f;

        for (int i = 1; i <= n; i++) {
            sum += ishora * a;
            ishora *= -1;
            a += 0.1;
        }

        System.out.println(" sum = " + sum);


    }
}
