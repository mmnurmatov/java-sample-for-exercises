package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikki xonali son kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println(a + " sonning yuzliklar xonasidagi son " + (a / 100) + " ga teng");
    }
}
