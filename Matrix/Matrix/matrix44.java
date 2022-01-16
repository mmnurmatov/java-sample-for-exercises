package Matrix;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 11.11.2015.
 */
public class matrix44 {
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
                a[i][j] = sc.nextInt(); //int)(Math.random()*20 + 4);
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

        int soni, soni1;
        int satrlar_soni = 0;
        int min = 1000000000;
        for (int i = 0; i < m; i++) {
            soni = 0; soni1 = 0;
            for (int j = 0; j < n - 1; j++) {

                if((a[i][j] < a[i][j + 1]))
                {
                    soni++;
                }
            }
            for (int j = 0; j < n - 1; j++) {
                if ((a[i][j] > a[i][j + 1]))
                {
                    soni1++;
                }
            }

            if (soni == 0 || soni1 == 0)
            {
                for (int k = 0; k < n; k++) {
                    if (min > a[i][k])
                    {
                        min = a[i][k];
                    }
                }
                satrlar_soni++;
            }
        }

        if (satrlar_soni == 0)
        {
            System.out.println("\nSaralangan satrlar yo'q");
        }
        else
        {
            System.out.println("\nElementlari o'sish yoki kamayish tartibida berilgan satrlar soni = " + satrlar_soni);
            System.out.println("Shu satrlar orasidagi eng kichik element = " + min);
        }
    }
}
