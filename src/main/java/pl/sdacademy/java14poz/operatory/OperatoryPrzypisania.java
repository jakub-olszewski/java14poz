package pl.sdacademy.java14poz.operatory;

/**
 * OperatoryPrzypisania
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 14:26
 **/
public class OperatoryPrzypisania {

    //
//        Przypisania  =, +=, -=, *=, /=
//
    public static void main(String[] args) {

        int liczbaA = 500;

        // zwiększmy liczbeA o 50
        liczbaA = liczbaA + 50;// <===

        System.out.println(liczbaA); // 550

        // += to skrót tego co jest powyżej
        liczbaA += 50; // znak += mozna traktować jako "zwiększ o"

        System.out.println(liczbaA); // 600

        liczbaA = liczbaA -50;

        System.out.println(liczbaA); // 550

        // -= to skrót od tego powyżej
        liczbaA -= 50;// znak -= mozna traktowac jako "zmniejsz o"

        System.out.println(liczbaA); // 500

        // *= \=

        int liczbaB = 5;
        // 5 krotnie zwiekszenie liczbaB
        liczbaB = liczbaB*5;

        System.out.println(liczbaB); // 25

        liczbaB *= 5; // *= krotne zwiększenie liczby

        System.out.println(liczbaB); // 125


        int liczbaC = 81;
        // 9 krotne zmniejszenie liczbaC

        liczbaC = liczbaC / 9;

        System.out.println(liczbaC); // 9

        liczbaC /= 9; // /= krotne mniejszenie liczby

        System.out.println(liczbaC); // 1
    }

}
