package Strings;



import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        String s = sc.nextLine();
        boolean bor = false;
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (!(a[i] >= '0' && a[i] <= '9'))
            {
                if (a[i] != '.')
                {
                    bor = true;
                }
            }
        }
        s = "";
        s = new String(a);
        if (bor == false)
        {
            if (s.indexOf('.') != -1)
            {
                System.out.println("Satrda haqiqiy son ifodalangan -> " + Float.parseFloat(s));
            }
            else if(s.indexOf('.') == -1)
             {
                System.out.println("Satrda butun son ifodalangan -> " + Integer.parseInt(s));
             }
        }
        else
        {
            System.out.println(0);
        }
    }
}