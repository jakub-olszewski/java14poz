package pl.sdacademy.java14poz.sklep;

/**
 * TestStatus
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.10.2018 07:52
 **/
public class TestStatus {
    public static void main(String[] args) {
        User uzytkownik = new User();

        uzytkownik.setStatus(User.TypStatus.AKTYWNY);
        //uzytkownik.setMiasto(User.Miasto.POZNAN);
        // TODO
        // * utworzyć getter/setter miasto
        // * enum Miasto POZNAN,WROCLAW,WARSZAWA,KRAKOW
        // * ustawic jak powyzej setMiasto
        // * utworzy if jesli z Poznania to
        // wypisz Uzytkownik Lokalny i ustaw
        // status na LOCAL

        // jezeli uzytkownik jest
        // aktywny wypisz "imie nazwisko jest aktywny"
        if(uzytkownik.getStatus()== User.TypStatus.AKTYWNY){
            System.out.println(uzytkownik+ " jest aktywny");
        }

    }

}



