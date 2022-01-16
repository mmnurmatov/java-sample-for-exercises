package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("(a < b) Ikkita butun son kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int k = 1;
        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(i + " ");
            }
            k++;
            System.out.println("");
        }


    }


}
