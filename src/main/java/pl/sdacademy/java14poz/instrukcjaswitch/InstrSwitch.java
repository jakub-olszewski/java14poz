package pl.sdacademy.java14poz.instrukcjaswitch;
import pl.sdacademy.java14poz.sklep.Miasto;
import pl.sdacademy.java14poz.sklep.User;
import pl.sdacademy.java14poz.sklep.User.TypStatus;
import pl.sdacademy.java14poz.sklep.UserUtils;

import static pl.sdacademy.java14poz.sklep.User.TypStatus.NIE_ZALOGOWANY;
/**
 * InstrSwitch
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.10.2018 13:08
 **/
public class InstrSwitch {
    public static void main(String[] args) {

        User janusz = new User("Janusz", "Typowy", 43);
        janusz.setStatus(NIE_ZALOGOWANY);

        User uzytkownik = new User();// uzytkownik utworzony konstruktorem domyślnym

        // uzycie metody statycznej z UserUtils
        System.out.println("\n\nTest uzycia metody statycznej z UserUtils");
        String napisStatusUzytkownika = UserUtils.pobierzStatus(uzytkownik);
        System.out.println(napisStatusUzytkownika);

        String napisStatusJanuszUzytkownika = UserUtils.pobierzStatus(janusz);
        System.out.println(napisStatusJanuszUzytkownika);

    }
}
