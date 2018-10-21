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

        boolean czyJestPelnoletni = wiekMalgosi >= wiekPelnoletnosci;
        System.out.println(czyJestPelnoletni); // false
        czyJestPelnoletni = wiekJasia > 17;
        System.out.println(czyJestPelnoletni); // true

        String miastoPoznan = "Poznań";
        String miastoKrakow = "Kraków";

        String miastoMalgosi = "Łódź";
        String miastoJasia = "Wrocław";
        String miastoJanusza = "Kabul";

        boolean czyMalgosiaMieszkaWPoznaniu ;// = ?
        // dwa sposoby

        // czy malgosia mieszka w Łodzi i jest pelnoletnia ?

        // czy janusz jest z wroclawia i moze glosowac ?

        // czy jasiu jest z poznania i moze zdawac na prawo jazdy ?

    }
}
