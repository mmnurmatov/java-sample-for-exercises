package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yil kiriting:");
        System.out.print("x = ");
        int x = sc.nextInt();

        if (x % 4 == 0 && x % 100 == 0 && x % 400 == 0)
        {
            System.out.println("Kabisa yili");
        }
        else System.out.println("Kabisa yili emas");



    }
}
