package pl.sdacademy.java14poz.petle.petlafor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * PetlaForZadanie2
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 14:24
 **/
public class PetlaForZadanie2 {

    /**
     * Wyszukiwanie tablica/list imion/uzytkownikow i wyszukiwanie elementow
     * zawierajacych w imieniu litere 'a'
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println(" Lista:");
        // zbior elementow z imieniami
        List<String> imiona = new ArrayList<>();
        imiona.add("Janusz");
        imiona.add("Julia");
        imiona.add("Małgosia");

        // petla
        for(String imie : imiona){
            if (imie.contains("l")){
                System.out.println(imie);
            }
        }

        System.out.println("===================================");
        System.out.println(" Tablica:");
        String[] tablicaImion = {"Janusz","Julia","Małgosia"};
        for(String imie : tablicaImion){
            if (imie.contains("l")){
                System.out.println(imie);
            }
        }

        // w petli sprawdzenie warunku zawierania litery 'a'

        // elementy spelniajace warunek zostana wypisane

        // z uzyciem petli wypisz imiona zaczynajace sie na litere 'J'
        // i kończące się na litere a
        // Uwaga. Należy użyć operatora logicznego
        // || lub
        // && i
        System.out.println("====================");
        for (String imie:imiona) {
            if (imie.startsWith("J") && imie.endsWith("a")) {
                System.out.println(imie);
            }
        }


    }
}
