package pl.sdacademy.java14poz.sklep;

import pl.sdacademy.java14poz.Kanapka;

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

        // zdanie stworz 5 zamowien i oblicz sume tych zamowień
        // i wysietlic zamowienia na ekranie oraz sume zamowien
        // trzeba zrobić metode toString() w zamowieniu
    }

}
