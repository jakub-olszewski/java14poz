package pl.sdacademy.java14poz.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ScannerZadania
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 15:32
 **/
public class ScannerZadania {

    public static void main(String[] args) {

        String napis = "List do \n mamy";

        // System.out - systemowe wyjscie czyli konsola
        // System.in  - systemowe wejscie czyli klawiatura
        Scanner skaner = new Scanner(System.in);


        /**
         * Zadanie wprowadz z klawiatury
         * 3 imiona i zapisz w postaci
         * listy z wykorzystaniem petli
         */
        System.out.println("Wprowadz 3 imiona:");
        List<String> listaImion = new ArrayList<>();

        for(int i= 0; i<3 ;i++){
            System.out.println("\nWprowadz imię i nacisnij enter: ");
            // skanner nextLine()
            String imie = skaner.nextLine();
            listaImion.add(imie);
            System.out.printf("Wprowadziłeś imie: %s",imie);

            /**
             * Zadanie domowe
             * for/while wprowadzanie imion
             * warunkiem zakończenia jest puste imię i enter
             * program wypisuje ile wprowadzono imion
             */


            // dodanie do listy wprowadzonego imienia add()
        }
        System.out.println("\nWprowadzono " + listaImion.size()+ " imion");

        /*
        Zadanie domowe

        wprowadzamy uzytkownikow
        tworzymy ich przez konstruktor imie i nazwisko

        pobranie z klawiatury nextInt() cyfry
        switch
        dla 1 - wprowadz uzytkownika
        dla 2 - wyszukaj po nazwisku
            wypisuje znaleziono "imie i nazwisko"

        Uwaga. Dodać odpowiednie komunikaty
         */
    }
}
