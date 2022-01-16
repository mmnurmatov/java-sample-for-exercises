package Classes;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 29.11.2015.
 */
public class MainClassTelefon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Abonent haqidagi ma'lumotlarni kiriting:");
        System.out.println("Abonent FISH kiriting:");
        String name = sc.nextLine();
        System.out.println("Abonent nomerini kiriting:");
        String nomer = sc.nextLine();
        System.out.println("Abonent manzilini kiriting:");
        String manzili = sc.nextLine();
        System.out.println("Abonent turini kiriting:");
        String turi = sc.nextLine();
        ClassTelefon mobil = new ClassTelefon(name, nomer, manzili, turi);
    }
}
