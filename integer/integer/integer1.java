package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Uzunlik birligini kiriting:");
        int a = sc.nextInt();

        System.out.println(a + " santimetr " + (a / 100) + " metrga teng");
    }
}
