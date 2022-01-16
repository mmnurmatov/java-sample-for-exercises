package Array;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int [n];

        for (int i = 0; i < n; i++) {

            a[i] = 2 * i + 1;
        }

        System.out.println("Hosil bo'lgan massiv elementlari:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

    }
}
