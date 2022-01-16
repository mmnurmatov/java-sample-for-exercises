package If;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 31.10.2015.
 */
public class if26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Haqiqiy son kiriting:");
        System.out.print("x = ");
        float x = sc.nextFloat();

        if (x  <= 0)
        {
            System.out.println("-x = " + (x *= -1));
        }
        else if (x >= 2)
            System.out.println("x = " + (4));
        else System.out.println("x * x = " + (x * x));


    }
}
