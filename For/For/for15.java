package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("a = ");
        float a = sc.nextFloat();


        float  sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= a;
        }

        System.out.println(a + " sonining " +  n + " chi darajasi = " + sum);


    }
}
