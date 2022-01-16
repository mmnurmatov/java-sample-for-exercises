package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if15 {
    public static void main(String[] args) {

        System.out.println("Uchta butun son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.print("C = ");
        int c = sc.nextInt();

        int max = 0;

        System.out.println("Natija");

        max = a + b;


        if (max < a + c)
        {
            System.out.println("Yig'indisi eng katta bo'ladigan ikkita sonlar:");
            System.out.println(a);
            System.out.println(c);
            return;
        }
        if (max < b + c) {
            System.out.println("Yig'indisi eng katta bo'ladigan ikkita sonlar:");
            System.out.println(b);
            System.out.println(c);
            return;
        }
        System.out.println("Yig'indisi eng katta bo'ladigan ikkita sonlar:");
        System.out.println(a);
        System.out.println(b);

    }
}
