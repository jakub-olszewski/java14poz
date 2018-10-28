package pl.sdacademy.java14poz.petle.petlafor;

import pl.sdacademy.java14poz.sklep.User;

import java.util.ArrayList;
import java.util.List;

/**
 * PetlaForZadania
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 13:07
 **/
public class PetlaForZadania {

    public static void main(String[] args) {

        //tablica imion

        String[] tablicaImion = {"Janusz","Marta", "Dominik"};

        //wypisanie w petli for imion z tablicy imion
        for (String elementZTablicyImion:tablicaImion){
            System.out.println(elementZTablicyImion);
        }

/**
 * for ponizej sklada sie z 3 czesci:
 * int i =0; ustawienie wartosci poczatkowej
 * i<5; warunek kontynuacji
 * i++; krok w petli, czyli zwiekszenie i o 1
 *
 */
        for(int i=0; i< 3;i++){
            // tutaj mozemy wypisac elementy z tablic
            // za pomoca numeru indeksu tablicy

            System.out.println(tablicaImion[i]);
        }

        /**
         * Zadanie to wypisz  lp. oraz imie i nazwisko
         * w petli uzytkownikow z listy stworzonej wczesniej
         * liste i elementy skopiowac ponizej
         */
        List<User> listaUzytkownikow = new ArrayList();
        listaUzytkownikow.add(new User("Julia", "Piękna"));
        listaUzytkownikow.add(new User("Ola","Mądra"));
        listaUzytkownikow.add(new User("Ala","Krótka"));
        listaUzytkownikow.add(new User("Olek","Konieczny"));
        listaUzytkownikow.add(new User("Witek","Gbur"));

        int liczbaPorzadkowa = 1;// wartosc poczatkowa liczby porzadkowej
        //wypisz imie nazwisko z uzyciem for i :
        for (User elementZListy: listaUzytkownikow) {
            System.out.print("Lp. ");
            System.out.print(liczbaPorzadkowa + " ");
            System.out.println(elementZListy.pobierzImieINazwisko());
            liczbaPorzadkowa++;// zwiekszenie liczby przadkowej o 1
        }

        //dodaj do for liczbe porzadkową

    }
}
