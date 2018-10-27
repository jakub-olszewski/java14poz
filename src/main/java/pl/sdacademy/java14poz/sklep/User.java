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
    String status;
    enum Status {AKTYWNY,NIEAKTYWNY,ZALOGOWANY,NIE_ZALOGOWANY};

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

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
