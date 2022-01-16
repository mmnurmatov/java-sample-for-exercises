package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class for30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Butun son kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Ikkita haqiqiy son kiriting:");
        System.out.print("A = ");
        float a = sc.nextFloat();
        System.out.print("B = ");
        float b = sc.nextFloat();
        float x = a;

        float s = (b - a - 1) / (float)n;
        double sum;

        System.out.println(a + " va " + b + " nuqtalar orasidagi ajratilgan nuqtalar");
        for (int i = 1; i <= n; i++) {
            x += s;
            System.out.println(i + " chi nuqta " + x);
            sum = 1 - Math.sin(x);
            System.out.println(i + " chi nuqta uchun f(x) = " + sum);
        }

    }


}
