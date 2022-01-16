package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean28 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nuqta koordinatalarini kiriting:");
        System.out.print("x = ");
        int x = sc.nextInt();

        System.out.print("y = ");
        int y = sc.nextInt();

        boolean g = x * y > 0;

        System.out.println(g);
    }
}
