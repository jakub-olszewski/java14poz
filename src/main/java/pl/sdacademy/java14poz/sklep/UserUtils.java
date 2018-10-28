package pl.sdacademy.java14poz.sklep;

import static pl.sdacademy.java14poz.sklep.User.*;
/**
 * UserUtils
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.10.2018 13:51
 **/
public class UserUtils {

    /**
     * Metoda zwraca napis imie nazwisko jest status
     *
     * @param uzytkownika
     * @return
     */
    public static String pobierzStatus(User uzytkownik) {
        StringBuilder builder = new StringBuilder();
        builder.append(uzytkownik.getImie()).append(" ").append(uzytkownik.getNazwisko());
        builder.append(" jest ");

        // wykorzystac switch
        User.TypStatus status = uzytkownik.getStatus();
        switch (status) {
            case AKTYWNY:
                builder.append("aktywny");
                break;
            case NIE_ZALOGOWANY:
                builder.append("nie zalogowany");
                break;
            case ZALOGOWANY:
                builder.append("zalogowany");
                break;
            case NIEAKTYWNY:
                builder.append("nieaktywny");
                break;
            default:
                builder.append("????");
        }
        // wykorzysta StringBuildera append
        // zwrocić jako string 'imie' 'nazwisko' jest 'status'
        // ponizej przyklad

        return builder.toString();
    }

    public static String pobierzPlec(User uzytkownik){
        StringBuilder rezultat = new StringBuilder();
        rezultat.append(uzytkownik.getImie()).append(" ").append(uzytkownik.getNazwisko());
        Plec plecPobranaOdUzytkownika = uzytkownik.getPlecUzytkownika();
        rezultat.append(" jest ");

        switch (plecPobranaOdUzytkownika){
            case KOBIETA:
                rezultat.append("kobietą");
                break;
            case NIEOKRESLONA:
                rezultat.append("nie określony");
                break;
            case MEZCZYZNA:
                rezultat.append("mężczyzną");
                break;

        }
        return rezultat.toString();

    }


}
