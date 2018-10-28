package pl.sdacademy.java14poz.kolekcje.listy;


import pl.sdacademy.java14poz.obiekty.Kanapka;
import pl.sdacademy.java14poz.sklep.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ListyZadania
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 12:10
 **/
public class ListyZadania {
    public static void main(String[] args) {

        /**
         * Wspolny interfejst dla obu implementacji
         * czyli metody dla obu implementacji sa
         * takie same
         */
        List listaLiczb = new ArrayList();
        //List<Object> lista = new ArrayList<Object>();

        listaLiczb.add(5);// dodanie elementu
        listaLiczb.add(4);

        listaLiczb.remove(0);// usuniecie
        listaLiczb.size();// pobranie rozmiaru
        System.out.println("Rozmiar listy wynosi :"+listaLiczb.size());

        List zamowieniaArray = new ArrayList();
        zamowieniaArray.size();

        /**
         * Stworz liste 5 uzytkownikow wypisz rozmiar listy
         */
        List<User> listaUzytkownikow = new ArrayList();

        User julia = new User("Julia", "Piękna");
        listaUzytkownikow.add(julia);
        User ola = new User("Ola","Mądra");
        listaUzytkownikow.add(ola);
        listaUzytkownikow.add(new User("Ala","Krótka"));
        listaUzytkownikow.add(new User("Olek","Konieczny"));
        listaUzytkownikow.add(new User("Witek","Gbur"));
        System.out.println("iloscUzytkownikow:"+ listaUzytkownikow.size());



        List zamowieniaLinked = new LinkedList();
        zamowieniaLinked.size();

        //Zadanie czym jest 'List' ?
    }
}
