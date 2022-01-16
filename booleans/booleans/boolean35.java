package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean35 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Shaxmat doskasi koordinalarini kiriting:");

        System.out.print("x1 = ");
        byte x1 = sc.nextByte();
        System.out.print("y1 = ");
        byte y1 = sc.nextByte();

        System.out.print("x2 = ");
        byte x2 = sc.nextByte();
        System.out.print("y2 = ");
        byte y2 = sc.nextByte();

        boolean g = ((x1 + y1) % 2 != 0  && (y2 + x2) % 2 != 0) || ((x1 + y1) % 2 == 0  && (y2 + x2) % 2 == 0);

        System.out.println(g);
    }
}
