package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 01.11.2015.
 */
public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ikkita butun son kiriting:");
        System.out.print("k = ");
        int k = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(k + " ");
        }
    }
}
