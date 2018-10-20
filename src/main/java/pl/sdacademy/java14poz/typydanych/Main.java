package pl.sdacademy.java14poz.typydanych;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 15:22
 **/
public class Main {

    public static void main(String[] args) {
        // typ danych prymitywny/prosty
        int liczbaA ;// deklaracja zmiennej
        liczbaA = 5; // inicjalizacje zmiennej
        //liczbaA = new int(3); //nie istnieje taki kod typ prymitywny nie jest obiektem
        // nie ma konstruktora


        // typ danych obiektowy
        Integer liczbaB;// deklaracja zmiennej
        liczbaB = 3; // inicjalizacje zmiennej
        liczbaB = new Integer(3);// inicjalizacje zmiennej

        // wykonanie metody na obiekcie Integer
        liczbaB.compareTo(7);

        boolean czyAWieksza = liczbaA>liczbaB;
        boolean czyAWieksza2 = liczbaB.compareTo(liczbaA) > 0;

        String napis = "napis";
        String znak = "b";
        System.out.println("Czy w napisie '"+napis+"' jest znak :" + znak);
        boolean czyZawiera = napis.contains("a");
        System.out.println(czyZawiera);

        // zadanie1 znak = "b" i powinno być false
        // zadanie2 stworzenie metody o nazwie  czyNapisZawieraZnak(String napis,char znak)
        // metoda ma zwrócić return false/true
    }


}
