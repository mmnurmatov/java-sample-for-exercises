package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean39 {
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

        boolean g =  Math.abs(x1 - x2) == 0 || Math.abs(y1 - y2) == 0 || Math.abs(x1 - x2) == Math.abs(y1 - y2);

        System.out.println(g);
    }
}
