package pl.sdacademy.java14poz.sklep;

/**
 * User
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 09:25
 **/
public class User {
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Miasto getMiastoZamieszkania() {
        return miastoZamieszkania;
    }

    public void setMiastoZamieszkania(Miasto miastoZamieszkania) {
        this.miastoZamieszkania = miastoZamieszkania;
    }

    // alt + insert
    // pola uzyte w uzytkowniku
    private String imie;
    private String nazwisko;
    private int wiek;
    private TypStatus status;
    private Miasto miastoZamieszkania;
    public enum TypStatus {AKTYWNY,NIEAKTYWNY,ZALOGOWANY,NIE_ZALOGOWANY,LOCAL};
    public enum Plec {MEZCZYZNA, KOBIETA,NIEOKRESLONA}
    private Plec plecUzytkownika;

    /**
     * Konstruktor z argumentami
     * @param podajImie
     * @param podajNazwisko
     * @param podajWiek
     */
    public User(String podajImie, String podajNazwisko, int podajWiek){
        imie = podajImie;
        nazwisko = podajNazwisko;
        wiek = podajWiek;
    }

    public User(String podajImie, String podajNazwisko){
        imie = podajImie;
        nazwisko = podajNazwisko;
    }


    public User(String imie, String nazwisko, int wiek, Plec plecUzytkownika) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plecUzytkownika = plecUzytkownika;
    }

    /**
     * Konstruktor bez argumentowy
     */
    public User() {
        //inicjalizujemy pola w konstruktorze
        imie = "anonim";
        nazwisko = "nieznane";
        wiek = 0;
        plecUzytkownika = Plec.NIEOKRESLONA;
        status = TypStatus.NIEAKTYWNY;
    }

    public String toString() {
        return imie + " " + nazwisko + " " + wiek + " "+ plecUzytkownika.toString().toLowerCase();
    }

    public String pobierzImieINazwisko(){
        return imie + " " + nazwisko;
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
