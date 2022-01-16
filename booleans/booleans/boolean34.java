package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean34 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Shaxmat doskasi koordinatasini kiriting:");

        System.out.print("x = ");
        byte x = sc.nextByte();
        System.out.print("y = ");
        byte y = sc.nextByte();

        boolean g = (x + y) % 2 != 0;

        System.out.println(g);
    }
}
