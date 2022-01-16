package Matrix;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();

        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(Math.random()*10 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nNatijaviy matrix");


            for (int i = 0; i < m; i++) {

                if (i % 2 == 0)
                {
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[i][j] + "\t");
                    }
                }
                else{
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.print(a[i][j] +  "\t");
                    }
                }
                System.out.println();
            }

    }
}
