package Case;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 01.11.2015.
 */
public class case1 {
    public static void main(String[] args) {
        System.out.println("1 va 7 oraliqda son kiriting:");
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Dushanba"); break;
            case 2:
                System.out.println("Seshanba"); break;
            case 3:
                System.out.println("Chorshanba"); break;
            case 4:
                System.out.println("Payshanba"); break;
            case 5:
                System.out.println("Juma"); break;
            case 6:
                System.out.println("Shanba"); break;
            case 7:
                System.out.println("Yakshanba"); break;
        }


    }
}
