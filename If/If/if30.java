package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("x = ");
        int x = sc.nextInt();

        if ((x > 0 && x < 10) || (x < 0 && x > -10)) {
            if (x > 0) {
                if ((int)(int)x % 2 == 0)
                    System.out.println("Bir xonali musbat juft son");
                else
                    System.out.println("Bir xonali musbat toq son");
            } else if (x < 0) {
                if ((int)x % 2 == 0)
                    System.out.println("Bir xonali manfiy juft son");
                else
                    System.out.println("Bir xonali manfiy toq son");
            }
        }
        else if ((x > 9 && x < 100) || (x < -9 && x > -100)) {
            if (x > 0) {
                if ((int)x % 2 == 0)
                    System.out.println("Ikki xonali musbat juft son");
                else
                    System.out.println("Ikki xonali musbat toq son");
            } else if (x < 0) {
                if ((int)x % 2 == 0)
                    System.out.println("Ikki xonali manfiy juft son");
                else
                    System.out.println("Ikki xonali manfiy toq son");
            }
        }
        else if ((x > 99 && x < 1000) || (x < -99 && x > -1000)) {
            if (x > 0) {
                if ((int)x % 2 == 0)
                    System.out.println("Uch xonali musbat juft son");
                else
                    System.out.println("Uch xonali musbat toq son");
            } else if (x < 0) {
                if ((int)x % 2 == 0)
                    System.out.println("Uch xonali manfiy juft son");
                else
                    System.out.println("Uch xonali manfiy toq son");
            }
        }
        else
                System.out.println("Nolga teng");


    }
}