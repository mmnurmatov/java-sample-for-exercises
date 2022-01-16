package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(0 < k < 365) oraliqda son kiriting:");
        System.out.print("k = ");
        int k = sc.nextInt();

        System.out.println(k % 7);

    }
}
