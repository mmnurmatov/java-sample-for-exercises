package Algoritmga_kirish;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 24.12.2015.
 */
public class algoritm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {2, 3, 4, 6, 7, 9, 10, 34, 55};
       /* for (int i = 0; i < a.length; i++) {
            a[i] = (int)Math.random()*20000;
        }*/

        long startMs, finishMs;
        startMs = System.currentTimeMillis();
        a = mergeSort(a, 0, a.length -1);
        finishMs = System.currentTimeMillis();
        System.out.println(finishMs-startMs);

        printArray(a);

    }

    static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static int[] mergeSort(int[] a, int left, int right){
        if(left == right) return new int[] {a[left]};
        int mid = (left + right) / 2;
        int [] b = mergeSort(a, left, mid);
        int [] c = mergeSort(a, mid + 1, right);

        int [] d = new int[b.length + c.length];
        int j = 0, i = 0, k = 0;
        while (i<b.length && j < c.length)
        {
            if(b[i] < c[j])
            {
                d[k++] = b[i++];
            }
            else
            {
              d[k++] = c[j++];
            }
        }
        while (i < b.length) d[k++] = b[i++];
        while (j < c.length) d[k++] = c[j++];
        return d;
    }
}
