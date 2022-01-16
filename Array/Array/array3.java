package Array;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("Arifmetik progressiyaning dastlabki hadini kiriting:");
        System.out.print("a = ");
        int x = sc.nextInt();
        System.out.println("Arifmetik progressiyaning ayirmasini kiriting:");
        System.out.print("d = ");
        int d = sc.nextInt();
        int[] a = new int [n];

        a[0] = x;

        for (int i = 1; i < n; i++) {

            a[i] = a[i - 1] + d;
        }

        System.out.println("Hosil bo'lgan arifmetik progressiya ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

    }
}
