package pl.sdacademy.java14poz.operatory;

/**
 * OperatoryRelacji
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 15:03
 **/
public class OperatoryRelacji {

    public static void main(String[] args) {

//         Relacji  <,<=,>,>=,==, !=
//
        int wiekMalgosi = 17;
        int wiekJasia = 19;
        int wiekJanusza = 43;
        int wiekPelnoletnosci = 18;
        int wiekZdawaniaNaPrawoJazdy = 13;

        boolean czyJestPelnoletni = wiekMalgosi >= wiekPelnoletnosci;
        System.out.println(czyJestPelnoletni); // false
        czyJestPelnoletni = wiekJasia > 17;
        System.out.println(czyJestPelnoletni); // true

        String miastoPoznan = "Poznań";
        String miastoKrakow = "Kraków";
        String miastoWroclaw = "Wrocław";

        String miastoMalgosi = "Łódź";
        String miastoJasia = "Wrocław";
        String miastoJanusza = "Kabul";

        boolean czyMalgosiaMieszkaWPoznaniu = miastoMalgosi == miastoPoznan;// = ?
        System.out.println(czyMalgosiaMieszkaWPoznaniu);

        czyMalgosiaMieszkaWPoznaniu = miastoMalgosi.equals(miastoPoznan);// = ?
        System.out.println(czyMalgosiaMieszkaWPoznaniu);


        // dwa sposoby

        // czy malgosia mieszka w Łodzi i jest pelnoletnia ?
        boolean czyMalgosiaMieszkaWLodziIJestPelnoletnia = miastoMalgosi == "Łódź"
                && wiekMalgosi >= wiekPelnoletnosci;
        System.out.println(czyMalgosiaMieszkaWLodziIJestPelnoletnia);
        // czy janusz jest z wroclawia i moze glosowac ?
        boolean czyJanuszJestZWroclawiaIMozeGlosowac = miastoJanusza==miastoWroclaw && wiekJanusza>=wiekPelnoletnosci;
        System.out.println(czyJanuszJestZWroclawiaIMozeGlosowac);
        // czy jasiu jest z poznania i moze zdawac na prawo jazdy ?
        boolean czyJasiuJestZPoznaniaIMozeZdawacNaPrawoJazdy = miastoJasia.equals(miastoPoznan) && wiekJasia >= wiekZdawaniaNaPrawoJazdy;
        System.out.println(czyJasiuJestZPoznaniaIMozeZdawacNaPrawoJazdy);
        // Utworz interfejs oraz implementacje (pakiet powtorzenie):
        // Nazwa interfejsu Pytania nazwa Implementacji {twoje imie}PytaniaImpl
        // * boolean czyJestPelnoletnia(int wiek);
        // * boolean jestZPoznania(String miasto);
        // * boolean mozeGlosowacWPoznaniu(String miasto, int wiek)
        // Klasa TestPytan sprawdzajaca dzialanie metod
    }
}
