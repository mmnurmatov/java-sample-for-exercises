package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikki xonali son kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println(a + " sonning birliklar xonasidagi son " + (a % 10) + " ga teng");
        System.out.println(a + " sonning o'nliklar xonasidagi son " + ((a / 10)% 10) + " ga teng");
    }
}
