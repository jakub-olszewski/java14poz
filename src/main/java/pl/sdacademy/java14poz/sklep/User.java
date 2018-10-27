package pl.sdacademy.java14poz.sklep;

/**
 * User
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 09:25
 **/
public class User {
    // alt + insert
    String imie;
    String nazwisko;
    int wiek;
    TypStatus status;
    NazwaMiasta miasto;
    enum TypStatus {AKTYWNY,NIEAKTYWNY,ZALOGOWANY,NIE_ZALOGOWANY,LOCAL};
    enum NazwaMiasta {POZNAN, KRAKOW, WROCLAW,WARSZAWA};

    /**
     * Konstruktor
     */
    public User() {
        imie = "anonim";
        nazwisko = "nieznane";
        wiek = 0;
    }

    public String toString() {
        return imie + " " + nazwisko + " " + wiek;
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

    public  NazwaMiasta getMiasto(){
        return miasto;
    }

    public  void setMiasto(NazwaMiasta ustawiamyMiasto){
        this.miasto = ustawiamyMiasto;
    }

}
