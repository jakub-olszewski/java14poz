package pl.sdacademy.java14poz.operatory;

/**
 * OperatoryLogiczne
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 14:50
 **/
public class OperatoryLogiczne {

    public static void main(String[] args) {

//        Logiczne  &&, ||, !
//
        // sytuacja dziecko mama i tata
        // dziecko jedzie za granice do Japonii
        boolean czyDzieckoMozeJechac;

        // && - podwójny ampersand oznacza 'i'
        boolean zgodaMamy;
        boolean zgodaTaty;
        zgodaMamy = true;
        zgodaTaty = false;

        czyDzieckoMozeJechac = zgodaMamy && zgodaTaty;
        System.out.print("Czy dziecko moze jechac ? ");
        System.out.println(czyDzieckoMozeJechac);

        boolean czyDzieckoMozeNocowacUKolegi;
        czyDzieckoMozeNocowacUKolegi = zgodaMamy || zgodaTaty;
        System.out.print("Czy dziecko moze nocowac u kolegi ? ");
        System.out.println(czyDzieckoMozeNocowacUKolegi);

        boolean czyDzieckoMozeGracNaKonsoli;
        boolean czyDzieckoMaKare = true;

        // ! oznacza negacje/zaprzeczenie lub krótko 'nie'
        // dziecko moze grac na konsoli = nie ma kary
        czyDzieckoMozeGracNaKonsoli = !czyDzieckoMaKare;
        System.out.print("Czy dziecko moze grać na konsoli ? ");
        System.out.println(czyDzieckoMozeGracNaKonsoli);

    }
}
