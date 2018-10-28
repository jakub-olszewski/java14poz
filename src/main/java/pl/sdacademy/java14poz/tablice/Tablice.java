package pl.sdacademy.java14poz.tablice;

/**
 * Tablice
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 11:04
 **/
public class Tablice {

    public static void main(String[] args) {

        int[] tablicaLiczb = new int[10];
        tablicaLiczb[9]= 123;
        wypiszElementTablicy(tablicaLiczb, 9);

        tablicaLiczb[0]= 0;
        wypiszElementTablicy(tablicaLiczb, 0);

        /**
         * Stworz tablice 5 uzytkownikow i
         * wypisz imie i nazwisko 2 oraz 4 uzytkownika
         * do konsoli
         * Uwaga. Typ danych to 'User' a nie 'int'
         */

    }

    private static void wypiszElementTablicy(int[] tablicaLiczb, int i) {
        System.out.printf("\nElement %s tablicy to %s", i, tablicaLiczb[i]);
    }
}
