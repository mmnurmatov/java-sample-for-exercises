package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean31 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Uchburchak tomonlarini kiriting:");

        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b =   sc.nextFloat();
        System.out.print("c = ");
        float c =   sc.nextFloat();

        boolean g = a == b || a == c || b == c;
        System.out.println(g);
    }
}
