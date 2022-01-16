package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if7 {
    public static void main(String[] args) {

        System.out.println("Ikkita butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("Ikkita sonning kichigining tartib raqami  = ");
        System.out.println( (a > b) ? 2 : 1);


    }
}
