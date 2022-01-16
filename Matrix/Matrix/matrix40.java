package Matrix;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, m;

        System.out.println("Matrixni satr uzunligini kiriting:");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.println("Matrixni ustun uzunligini kiriting:");
        System.out.print("n=");
        n = sc.nextInt();

        int  a[][] = new int[m][n];

        System.out.println("Matritsa elementlarini kiriting:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(Math.random()*20 + 4);
            }
        }

        System.out.println("\nHosil bo'lgan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("\nNatija:");


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (a[i][j] > a[i][k])
                    {
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }

            }
        }


        int soni = 1;
        int max = 0, index = 0;
        int max1 = 0;

        for (int i= 0;  i < m;  i++) {
            soni = 1;
            for (int j = 0; j < n - 1; j++) {
               if (a[i][j] == a[i][j + 1])
               {
                   soni++;
               }
                else
               {
                   soni = 1;
               }

                if (max <= soni)
                {
                    max = soni;
                }

            }
            if (max1 <= max)
            {
                max1 = max;
                index = i;
            }
            max = 0;
        }


        System.out.println("\nSaralangan matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        if (max1 == 1)
            System.out.println(" \nSatrda bir xil elementlar yo'q");
        else
            System.out.println(index + " satrda bir xil elementlar soni eng ko'p bo'lgan oxirgi satr");

    }
}
