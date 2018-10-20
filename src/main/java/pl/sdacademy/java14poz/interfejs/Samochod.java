package pl.sdacademy.java14poz.interfejs;

/**
 * Samochod jest to interfejs, czyli zbior metod bez implementacji (zbior czynnosci do wykonania)
 * Interfejst posiada metody publiczne
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 14:04
 **/
public interface Samochod {

    /**
     * Metoda wlaczajaca silnik zwraca void czyli nie zwraca zadnych informacji
     */
     void wlaczSilnik();

     void wylaczSilnik();

    /**
     * Metoda otwierajaca auto przy uzyciu klucza autoryzacyjnego
     * @param klucz dlugi ciag znakow
     */
     void otworzSamochod(String klucz);
}
