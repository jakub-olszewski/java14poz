package pl.sdacademy.java14poz.konwersjetypow;

/**
 * Konwersje
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.10.2018 07:04
 **/
public class Konwersje {

    public static void main(String[] args) {

        char znak = 'a';
        byte bajt = 126;
        int calkowity = 12345678;
        short malaLiczba = 32234;
        double zmiennoprzecinkowaDuza = 12.1234567898765432;
        float zmiennoprzecinkowaMala = 1.123456789f;

        System.out.println(bajt);
        char znakZBajta = (char) bajt;
        System.out.println(znakZBajta);

        // utrata danych
        System.out.println("\nkonwersja int na short");
        System.out.println(calkowity);
        short malaLiczbaZInta = (short) calkowity;
        System.out.println(malaLiczbaZInta);

        // bez utraty danych
        System.out.println("\nkonwersja short na int");
        System.out.println(malaLiczba);
        int calkowitaZMalejLiczby = (int) malaLiczba;
        System.out.println(calkowitaZMalejLiczby);

        System.out.println("\nkonwersja niejawna");
        int a = 5;
        double b = 8.5;
        double c = b/a;
        System.out.println(c);

        System.out.println("\nkonwersja jawna");
        int a2 = 4;
        double b2 = 8.5;
        double c2 = b2/a2;
        System.out.println(c2);

        System.out.println("\nkonwersja jawna");
        int a3 = 4;
        double b3 = 8.5;
        int c3 = (int)b3/a3;
        System.out.println(c3);

    }
}
