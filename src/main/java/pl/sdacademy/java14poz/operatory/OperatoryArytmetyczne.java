package pl.sdacademy.java14poz.operatory;

/**
 * OperatoryArytmetyczne
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 14:39
 **/
public class OperatoryArytmetyczne {

    public static void main(String[] args) {

        //        Arytmetyczne  +,-,*,/,%,++
        //  % ++ --

        // % modulo skrót mod - reszta z dzielenia
        int liczbaA = 81;

        int liczbaB = liczbaA % 10;

        System.out.println(liczbaB); // 1

        int liczbaC = liczbaA % 7;

        System.out.println(liczbaC); // 4

        // ++
        int liczbaD = 100;

        // zwiększenie o 1
        liczbaD = liczbaD + 1;

        System.out.println(liczbaD); // 101

        liczbaD++;// ++ skrót zwiększenia o 1

        System.out.println(liczbaD); // 102


        //-- to zmniejszenie o 1

        liczbaD = 100;

        liczbaD = liczbaD -1;

        System.out.println(liczbaD); // 99

        liczbaD--;

        System.out.println(liczbaD); // 98
    }
}
