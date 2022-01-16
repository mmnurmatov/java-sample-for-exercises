package Array;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 03.11.2015.
 */
public class array64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivlar o'lchamini kiriting:");
        System.out.print("n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[3*n];

        System.out.println("\na -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nb -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("\nc -  massiv elementlarini kiriting:");
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        System.out.println("\nHosil bo'lgan a - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println("\nHosil bo'lgan b - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "  ");
        }

        System.out.println("\nHosil bo'lgan c - massiv elementlari");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + "  ");
        }

        int son_a = 0, son_b = 0, son_c = 0;
        int k = 0;
        if (a[0] > b[0] && b[0] > c[0])
        { son_c = 1; son_b = 2; son_a = 3;}

        if (c[0] > b[0] && b[0] > a[0])
        { son_c = 3; son_b = 2; son_a = 1;}

        if (a[0] > c[0] && c[0] > b[0])
        { son_a = 3; son_b = 1; son_c = 2;}

        if (b[0] > c[0] && c[0] > a[0])
        { son_b = 3; son_c = 2; son_a = 1;}

        if (c[0] > a[0] && a[0] > b[0])
        { son_c = 3; son_b = 1; son_a = 2;}

        if (b[00] > a[0] && a[0] > c[0])
        { son_c = 1; son_b = 3; son_a = 2;}

        int l = 0, di = 0;

        for (int i = 0; i < n; i++) {

                    if (son_a == 1) {
                        d[di++] = a[l++];
                    } else if (son_b == 1) {
                        d[di++] = b[l++];
                    } else if (son_c == 1) {
                        d[di++] = c[l++];
                    }

                if (l == n)
                {l = 0;}
            }
            for (int i = 0; i < n; i++)
            {
                    if (son_a == 2)
                    {
                        d[di++] = a[l++];
                    }
                    else if (son_b == 2){
                        d[di++] = b[l++];
                    }
                    else if (son_c == 2){
                        d[di++] = c[l++];
                    }

                if (l == n)
                {
                    l = 0;
                }
            }
            for (int i = 0; i < n; i++)
            {
                    if (son_a == 3)
                    {
                        d[di++] = a[l++];
                    }
                    else if (son_b == 3){
                        d[di++] = b[l++];
                    }
                    else if (son_c == 3){
                        d[di++] = c[l++];
                    }

                if (l == n)
                {
                   l = 0;
                }
            }



        System.out.println("");
        System.out.println("Natija");

        System.out.println("\nd - massiv ko'rinishi");
        for (int i = 0; i < di; i++) {
            System.out.print(d[i] + "  ");
        }
    }
}