package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int  sum = 0;
        int k = 0;

        for (int i = 1; i <= (2*n - 1); i += 2) {
            sum += i;
            System.out.println(++k + " sonining kvadrati " + sum);
        }


    }
}
