package Classes;

import Strings.String2;

/**
 * Created by Maqsud-PC on 29.11.2015.
 */
public class ClassTelefon {

    String name;
    String nomer;
    String manzili;
    String sort;


    ClassTelefon (String name, String nomer, String manzili, String sort){
        this.name = name;
        this.nomer = nomer;
        this.manzili = manzili;
        this.sort = sort;
        this.info();
    }


    void clear(){
        this.name = null;
        this.nomer = null;
        this.manzili = null;
        this.sort = null;
    }

    void info() {
        System.out.println("Abonent ismi:  " + this.name);
        System.out.println("Abonent raqami:  " + this.nomer);
        System.out.println("Abonent manzili:   " + this.manzili);
        System.out.println("Abonent turi:  " + this.sort);
    }

}
