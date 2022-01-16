package For;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 01.11.2015.
 */
public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Konfet narxini kiriting:");
        System.out.print("a = ");
        float a = sc.nextFloat();


        for (int i = 1; i <= 10; i++) {
            System.out.print( i + " kg konfet " + a * ((float)i / 10) + " so'm turadi");
            System.out.println("");
        }


    }
}