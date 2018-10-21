package pl.sdacademy.java14poz.sklep;

import pl.sdacademy.java14poz.obiekty.Kanapka;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 09:48
 **/
public class Main {
    public static void main(String[] args) {
        User janusz = new User();
        Kanapka kanapkazSzynka = new Kanapka("szynka");
        System.out.println(janusz.toString());
        System.out.println(janusz);
        System.out.println(kanapkazSzynka);

        StringBuilder budujNapis = new StringBuilder();
        budujNapis.append('\n');
        budujNapis.append("=====================\n");
        budujNapis.append("== Lista Zamówień ===\n");
        budujNapis.append("=====================\n");


        // zadanie utworz string buildera i
        // za pomoca metody append dodaj napisy ponizej do siebie

        // zdanie stworz 5 zamowien i oblicz sume tych zamowień
        // i wysietlic zamowienia na ekranie oraz sume zamowien
        // trzeba zrobić metode toString() w zamowieniu
        Zamowienie zamowienie1 = new Zamowienie(1, 2.99);
        //System.out.println(zamowienie1.toString());
        budujNapis.append("\n>").append('\t').append(zamowienie1);
        Zamowienie zamowienie2 = new Zamowienie(2, 1.99);
        //System.out.println(zamowienie2);
        budujNapis.append("\n>").append('\t').append(zamowienie2);

        Zamowienie zamowienie3 = new Zamowienie(3, 0.99);
        //System.out.println(zamowienie3);
        budujNapis.append("\n>").append('\t').append(zamowienie3);

        Zamowienie zamowienie4 = new Zamowienie(4, .19);
        //System.out.println(zamowienie4);
        budujNapis.append("\n>").append('\t').append(zamowienie4);

        Zamowienie zamowienie5 = new Zamowienie(5, .09);
        //System.out.println(zamowienie5);
        budujNapis.append("\n>").append('\t').append(zamowienie5);


        float suma = 0;
        float cena1 = zamowienie1.pobierzCene();
        // czy ma być ?
        suma = cena1;

        float cena2 = zamowienie2.pobierzCene();
        float cena3 = zamowienie3.pobierzCene();
        float cena4 = zamowienie4.pobierzCene();
        float cena5 = zamowienie5.pobierzCene();
        suma = cena1 + cena2 + cena3 + cena4 + cena5; // ? czy to jest poprawnie ?

        // formatowanie do 2 cyfr po przecinku
        System.out.printf("Suma: %.2f zł",suma);
        // podpowiedź: użyj String.format() dziala podobnie jak linijka wyżej

        budujNapis.append(String.format("\n\nSuma: %.2f zł",suma));

        //System.out.println("Suma: "+suma);
        // brak formatowania wiele cyfr po przecinku
        System.out.println(budujNapis);

    }

}
