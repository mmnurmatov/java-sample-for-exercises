package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean24 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Kvadrat tenglamaning koeffitsiyentlarini kiriting:");
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c;

        boolean g = d >= 0;

        System.out.println(g);
    }
}
