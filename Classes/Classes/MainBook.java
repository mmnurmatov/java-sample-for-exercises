package Classes;

import java.util.Scanner;

/**
 * Created by Maqsud-PC on 30.11.2015.
 */
public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kitob nomini kiriting:");
        String title = sc.nextLine();
        System.out.println("Kitob muallifini kiriting:");
        String author = sc.nextLine();
        System.out.println("Kitobni varaqlar sonini kiriting:");
        int pages = sc.nextInt();

        Book kitob = new Book(title, author, pages);
    }
}
