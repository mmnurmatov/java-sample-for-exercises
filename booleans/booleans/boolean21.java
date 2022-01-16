package booleans;

        import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class boolean21 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Uch xonali son kiriting:");
        System.out.print("a = ");
        int x = sc.nextInt();

        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;

        boolean g = a < b && b < c;

        System.out.println(g);
    }
}
