package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean32 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Uchburchak tomonlarini kiriting:");

        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b =   sc.nextFloat();
        System.out.print("c = ");
        float c =   sc.nextFloat();

        boolean g = a == Math.hypot(c,b) || c == Math.hypot(a,b) || b == Math.hypot(c,a);
        System.out.println(g);
    }
}
