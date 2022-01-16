package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean29 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Nuqta koordinatalarini kiriting:");


        System.out.print("x = ");
        float x = sc.nextFloat();
        System.out.print("y = ");
        float y = sc.nextFloat();
        System.out.println("To'rtburchak chap yuqori koordinatalarini kiriting:");
        System.out.print("x1 = ");
        float x1 = sc.nextFloat();
        System.out.print("y1 = ");
        float y1 = sc.nextFloat();
        System.out.println("To'rtburchak o'ng pastki koordinatalarini kiriting:");
        System.out.print("x2 = ");
        float x2 = sc.nextFloat();
        System.out.print("y2 = ");
        float y2 = sc.nextFloat();

        boolean g = x2 > x && y1 > y && x > x1 && y > y2;

        System.out.println(g);
    }
}
