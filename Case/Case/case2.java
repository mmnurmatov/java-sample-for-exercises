package Case;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 01.11.2015.
 */
public class case2 {
    public static void main(String[] args) {
        System.out.println("1 va 5 oraliqda son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Yomon"); break;
            case 2:
                System.out.println("Qoniqarsiz"); break;
            case 3:
                System.out.println("Qoniqarli"); break;
            case 4:
                System.out.println("Yaxshi"); break;
            case 5:
                System.out.println("A'lo"); break;
        }


    }
}
