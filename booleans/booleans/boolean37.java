package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean37 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Shaxmat doskasi koordinalarini kiriting:");

        System.out.print("x1 = ");
        double x1 = sc.nextDouble();
        System.out.print("y1 = ");
        double y1 = sc.nextDouble();

        System.out.print("x2 = ");
        double x2 = sc.nextDouble();
        System.out.print("y2 = ");
        double y2 = sc.nextDouble();

        boolean g = (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 0)|| (Math.abs(y1 - y2)  == 1 && Math.abs(x1 - x2) == 0) || Math.hypot(x1-x2,y1-y2) == Math.sqrt(2);

        System.out.println(g);
    }
}
