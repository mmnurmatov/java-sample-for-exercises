package If;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("x = ");
        float x = sc.nextFloat();

        if (x  < 0) {
            System.out.println(0);
        }
         else if((int)x % 2 == 0){
            System.out.println(1);
        }
        else {
            System.out.println(-1);
        }



    }
}
