package pl.sdacademy.java14poz.varargs;

import pl.sdacademy.java14poz.sklep.Zamowienie;

/**
 * Varargs
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 28.10.2018 14:59
 **/
public class Varargs {
    public static void main(String[] args) {
        //zamowienia
        Zamowienie zamowienie1 = new Zamowienie(1, 12.99);
        Zamowienie zamowienie2 = new Zamowienie(1, 2.99);
        Zamowienie zamowienie3 = new Zamowienie(1, 0.99);

        // sumujemy zamowienia
        double suma1 = sumaZamowien(zamowienie1, zamowienie2, zamowienie3);
        double suma2 = sumaZamowien2(zamowienie1, zamowienie2);
        double suma3 = sumaZamowien3(zamowienie1, zamowienie2, zamowienie3);

        System.out.print("Wyswietlanie - suma2: ");
        System.out.println(suma2);
        System.out.print("Wyświetlanie - suma1: ");
        System.out.println(suma1);
        System.out.print("Wyświetlanie - suma3: ");
        System.out.println(suma3);


    }

    /**
     * Metoda zawierajaca w argumencie ... 3kropki - wiele elemenetow
     * uzywamy for z 'i' tym elementem z tablicy
     * @param zamowienia
     * @return
     */
    public static double sumaZamowien(Zamowienie... zamowienia) {
        double suma = 0;
        for (int i = 0; i < zamowienia.length; i++) {
            suma += zamowienia[i].pobierzCene();
        }
        return suma;
    }

    /**
     * Uzywamy for z ':'
     * @param zamowienia
     * @return
     */
    public static double sumaZamowien3(Zamowienie... zamowienia) {
        double suma = 0;
        for (Zamowienie zamowienie : zamowienia) {
            suma += zamowienie.pobierzCene();
        }
        return suma;
    }

    /**
     * Metoda zawerajaca dokladnie dwa argumenty
     *
     * @param zamowienie1
     * @param zamowienie2
     * @return
     */
    public static double sumaZamowien2(Zamowienie zamowienie1, Zamowienie zamowienie2) {
        return zamowienie1.pobierzCene() + zamowienie2.pobierzCene();
    }
}
