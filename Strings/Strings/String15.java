package Strings;



import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.locale();
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();

        char[] a = s.toCharArray();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((((int)a[i] >= 97) &&  ((int)a[i] <= 122)) || (((int)a[i] >= 160) &&  ((int)a[i] <= 173) || (((int)a[i] >= 224) &&  ((int)a[i] <= 239))))
            {
                count++;
            }
        }

        s = new String(a);
        System.out.println(s + " satrda kichik lotin va krill harflarining umumiy soni = " + count);

    }
}