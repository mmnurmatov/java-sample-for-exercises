package integer;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 28.10.2015.
 */
public class integer22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kun boshidan boshlab qancha sekund o'tganini kiriting:");
        System.out.print("A = ");
        int a = sc.nextInt();
        int b = a / 3600;
        int c = a % 3600;

        System.out.println("Demak kun boshidan boshlab " + b + (" soat va ") + c + " sekund o'tgan ekan");
    }
}
