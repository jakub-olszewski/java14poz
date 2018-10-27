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

        uzytkownik.setStatus(" aktYwnY ");

        // jezeli uzytkownik jest
        // aktywny wypisz "imie nazwisko jest aktywny"
        if(uzytkownik.getStatus().equalsIgnoreCase("aktywny")){
            System.out.println(uzytkownik+ " jest aktywny");
        }

    }

}



