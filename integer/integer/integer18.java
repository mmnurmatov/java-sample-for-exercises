package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("999 dan katta bo'lgan son kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();

        System.out.println(a + " sonning mingliklar xonasidagi son " + (a / 1000) + " ga teng");
    }
}
