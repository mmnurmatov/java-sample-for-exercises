package Classes;

/**
 * Created by Maqsud-PC on 30.11.2015.
 */
public class Book {
    String title;
    String author;
    int pages;

    Book (String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.show_book();
    }


    void show_book(){
        System.out.println("Kitobning nomi:   " + title);
        System.out.println("Kitob muallifi:   " + author);
        System.out.println("Kitobning varaqlar soni:  " + pages);
    }

}
