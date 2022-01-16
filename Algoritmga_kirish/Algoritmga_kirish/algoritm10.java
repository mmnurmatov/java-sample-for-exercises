package Algoritmga_kirish;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 25.12.2015.
 */
public class algoritm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a = 0,b = 0,c = 0,d = 0,e = 0;
        int sum = 0, sum1 = 0;

        System.out.print("Summani kiriting:\nn = ");
        n = sc.nextInt();

        System.out.println("Ombordagi pullar:");
        System.out.println("100 so'mlik 500 ta ");
        System.out.println("50 so'mlik 100 ta ");
        System.out.println("25 so'mlik 300 ta ");
        System.out.println("10 so'mlik 200 ta ");
        System.out.println("5 so'mlik 1000 ta ");
        System.out.println("1 so'mlik 900 ta ");


        System.out.println("Maydalashlar sonini tanlang:");
        System.out.print("100 so'mlik:  = ");
        a = sc.nextInt();
        System.out.print("50 so'mlik:  = ");
        b = sc.nextInt();
        System.out.print("25 so'mlik:  = ");
        c = sc.nextInt();
        System.out.print("10 so'mlik:  = ");
        d = sc.nextInt();
        System.out.print("5 so'mlik:  = ");
        e = sc.nextInt();


        int sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
        for (int j = 0; j < a; j++)
            sum1 += 100;
        System.out.println("100 so'mlik pullar :" + sum1);

        for (int i = 0; i < b; i++)
        {
            sum1 += 50;
            sum2 += 50;
        }

        System.out.println("50 so'mlik pullar :" + sum2);

        for (int j = 0; j < c; j++)
        {
            sum1 += 25;
            sum3 += 25;
        }

        System.out.println("25 so'mlik pullar :" + sum3);



        for (int j = 0; j < d; j++)
        {
            sum1 += 10;
            sum4 += 10;
        }

        System.out.println("10 so'mlik pullar :" + sum4);

        for (int j = 0; j < e; j++)
        {
            sum1 += 5;
            sum5 += 5;
        }

        System.out.println("5 so'mlik pullar :" + sum5);


        sum = n - sum1;
        if(sum > 0)
        System.out.println("1 so'mlik so'mlar: " + sum);
    }
}
