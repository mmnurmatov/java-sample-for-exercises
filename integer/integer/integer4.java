package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fayl hajmini kiriting:");
        int a = sc.nextInt();

        System.out.println(a + " bayt " + (Math.round(a) / 1024) + " kilobaytga teng");
    }
}
