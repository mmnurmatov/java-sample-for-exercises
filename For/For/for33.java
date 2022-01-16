package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f = 0;

        System.out.print(f1 + " " + f2);
        for (int i = 3; i <= n; i++) {

            f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.print( " " + f);
        }


    }


}
