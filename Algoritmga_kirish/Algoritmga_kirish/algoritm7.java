package Algoritmga_kirish;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 24.12.2015.
 */
public class algoritm7 {

 static  void funksiya(int a[], int k, int n) {

        int new_elem, child;
        new_elem = a[k];

        while(k <= n/2) {
            child = 2*k;

            if( child < n && a[child] < a[child+1] )
                child++;
            if( new_elem >= a[child] ) break;

            a[k] = a[child];
            k = child;
        }
        a[k] = new_elem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[50];
        int  n, x;

        System.out.print("n =");
        n = sc.nextInt();


        for(int i=0;i<n;i++)
        {
            a[i]=(int)(Math.random()*1000);
        }
        System.out.println("Kiritilgan massiv\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i] + "\t");
        }

        for(int i=n/2-1; i >= 0; i--)
        {
            funksiya(a, i, n-1);
        }
        for(int i=n-1; i > 0; i--)
        {
            x=a[i]; a[i]=a[0];
            a[0]=x;
            funksiya(a, 0, i-1);
        }
        System.out.println("\n\n Piramida usuli bilan saralangan massiv ->\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i] + "\t");
        }

    }
}
