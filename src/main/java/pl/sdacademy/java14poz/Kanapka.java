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

    /**
     * Konstruktor argumentowy
     * @param podanySkladTworzonejKanapki
     */
    public Kanapka(String podanySkladTworzonejKanapki){
        sklad = podanySkladTworzonejKanapki;
    }

    /**
     * Konstruktor argumentowy
     * @param podanySkladTworzonejKanapki
     */
    public Kanapka(String podanySkladTworzonejKanapki,int podanaIloscSkladnik){
        sklad = podanySkladTworzonejKanapki;
        iloscSkladnikow = podanaIloscSkladnik;
    }

    /**
     * Konstruktor argumentowy
     * @param podanaIloscSkladnikow
     */
    public Kanapka(int podanaIloscSkladnikow){
        iloscSkladnikow = podanaIloscSkladnikow;
    }

    /**
     * Metoda podajaca sklad kanapki
     * @return sklad kanapki
     */
    public String podajSklad(){
        return sklad;
    }
}
