package pl.sdacademy.java14poz;

/**
 * Kanapka
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 12:56
 **/
public class Kanapka {

    String sklad;// deklaracja zmiennej sklad
    int iloscSkladnikow;

    /**
     * Konstruktor kanapki bezargumentowy - domyślnym
     */
    public Kanapka(){
        sklad = "ser,pomidor";// inicjalizacja zmiennej sklad
        iloscSkladnikow = 2;
    }

    public Kanapka(String podanySkladTworzonejKanapki){
        sklad = podanySkladTworzonejKanapki;
    }

    // napisz konstruktor z argumentem iloscSkladnikow
    // napisz konstruktor z argumentem sklad i iloscSkladniow
    // utworz kanapki za pomocą tych konstruktorów w App

    /**
     * Metoda podajaca sklad kanapki
     * @return sklad kanapki
     */
    public String podajSklad(){
        return sklad;
    }
}
