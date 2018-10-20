package pl.sdacademy.java14poz;

/**
 * Kanapka
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 12:56
 **/
public class Kanapka {

    String sklad;// deklaracja zmiennej sklad

    /**
     * Konstruktor kanapki bezargumentowy - domyślnym
     */
    public Kanapka(){
        sklad = "ser,pomidor";// inicjalizacja zmiennej sklad
    }

    /**
     * Metoda podajaca sklad kanapki
     * @return sklad kanapki
     */
    public String podajSklad(){
        return sklad;
    }
}
