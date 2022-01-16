package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Og'irlik birligini kiriting:");
        int a = sc.nextInt();

        System.out.println(a + " kilogramm " + (a / 1000) + " tonnaga teng");
    }
}
