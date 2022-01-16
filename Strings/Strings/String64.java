package Strings;

import com.sun.media.sound.SF2Modulator;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 20.11.2015.
 */
public  class String64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Satrni kiriting:");
        System.out.print("s = ");
        String s = sc.nextLine();
        int k;

        do {
            System.out.print("k = ");
            k = sc.nextInt();
        } while (!(0 < k && k < 10));


        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '.' || a[i] == '?' || a[i] == ',' || a[i] == '!' || a[i] == ' ')
            {
                continue;
            }
            else
            {
                if((int)a[i] >= 65 && (int)a[i] <= 90)
                {
                    if ((int)a[i] - k < 65)
                    {
                        int b = (int)a[i] - k + 26;
                        char n = (char)b;
                        a[i] = n;
                    }
                    else
                    {
                        int c = (int)a[i] - k;
                        char m = (char)c;
                        a[i] = m;
                    }
                }
                else if ((int)a[i] >= 97 && (int)a[i] <= 122)
                {
                    if ((int)a[i] - k < 97)
                    {
                        int b = (int)a[i] - k + 26;
                        char n = (char)b;
                        a[i] = n;
                    }
                    else
                    {
                        int c = (int)a[i] - k;
                        char m = (char)c;
                        a[i] = m;
                    }
                }

            }
        }

        s = new String(a);
        System.out.println(s);

    }
}