package pl.sdacademy.java14poz.sklep;

/**
 * User
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 09:25
 **/
public class User {
    // alt + insert
    // pola uzyte w uzytkowniku
    String imie;
    String nazwisko;
    int wiek;
    TypStatus status;
    Miasto miastoZamieszkania;
    public enum TypStatus {AKTYWNY,NIEAKTYWNY,ZALOGOWANY,NIE_ZALOGOWANY,LOCAL};
    enum Plec {MEZCZYZNA, KOBIETA,NIEOKRESLONA}
    Plec plecUzytkownika;


    /**
     * Konstruktor
     */
    public User() {
        //inicjalizujemy pola w konstruktorze
        imie = "anonim";
        nazwisko = "nieznane";
        wiek = 0;
        plecUzytkownika = Plec.NIEOKRESLONA;
    }

    public String toString() {
        return imie + " " + nazwisko + " " + wiek + " "+ plecUzytkownika.toString().toLowerCase();
    }

    public TypStatus getStatus(){
        return status;
    }

    public void setStatus(TypStatus ustawianyStatus){
        // this - to jest klasa w ktorej jestesmy
        // czyli User
        // this.status - to pole status w uzytkowniku
        this.status = ustawianyStatus;
    }

    public  Miasto getMiasto(){
        return miastoZamieszkania;
    }

    public  void setMiasto(Miasto ustawiamyMiasto){
        this.miastoZamieszkania = ustawiamyMiasto;
    }

    public Plec getPlecUzytkownika(){
        return plecUzytkownika;
    }

    public void setPlecUzytkownika(Plec wybranaPlec){
        this.plecUzytkownika = wybranaPlec;

    }

}
