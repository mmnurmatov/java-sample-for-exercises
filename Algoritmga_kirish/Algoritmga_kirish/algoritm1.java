package Algoritmga_kirish;

import javax.imageio.ImageIO;
import java.util.Scanner;

/**
 * Created by Maqsud-PC on 24.12.2015.
 */
public class algoritm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting:");
        System.out.print("n=");
        int n = sc.nextInt();
        float[] a = new float[n];
        int index = 0;
        float x = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\n\nQidirilayotgan indeksni kiriting:\nindex = ");
        index = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(i == index)
            {
                System.out.print("\nQidirilayotgan index elementi = " + a[i]);
                break;
            }
        }

        System.out.print("\n\nQidirilayotgan elementni kiriting:\nx = ");
        x = sc.nextFloat();

        for (int i = 0; i < n; i++) {
            if(a[i] == x)
            {
                System.out.print("\nQidirilayotgan element indeksi = " + i);
                break;
            }
        }


    }
}
