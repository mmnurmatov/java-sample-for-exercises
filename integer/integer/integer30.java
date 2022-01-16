package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yil kiriting:");
        System.out.print("yil = ");
        int yil = sc.nextInt();

        System.out.println(yil +  " yil " + ((yil - 1) / 100 + 1) + " asr ");

    }
}
