package pl.sdacademy.java14poz.sklep;

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
    public static String pobierzStatus(User uzytkownik){
        StringBuilder builder = new StringBuilder();
        builder.append(uzytkownik.getImie()).append(" ");
        builder.append(uzytkownik.getNazwisko()).append(" ");
        builder.append(" jest ");

        // wykorzystac switch
        User.TypStatus status = uzytkownik.getStatus();
        switch (status){
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
}
