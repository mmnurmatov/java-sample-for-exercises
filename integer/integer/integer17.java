package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("999 dan katta bo'lgan son kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println(a + " sonning yuzliklar xonasidagi son " + ((a / 100) % 10) + " ga teng");
    }
}
