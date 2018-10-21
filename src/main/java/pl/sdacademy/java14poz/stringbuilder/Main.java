package pl.sdacademy.java14poz.stringbuilder;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 12:40
 **/
public class Main {

    public static void main(String[] args) {

        String napisNull=null;
        String napis = "Liczba %d \n";
        String wierszyk = "Były %d świnki pierwsza miała na imię %s\n\n";
        System.out.printf(napis,12);
        System.out.println(napis);
        System.out.printf(wierszyk,3, "Pepe");

        // formatowanie liczby
        float suma = 5.12000123f;
        System.out.printf("Suma: %.2f zł",suma);


        StringBuilder budujNapis = new StringBuilder();
        budujNapis.append("\na").append('\n');
        budujNapis.append("\\");// consola: \
        budujNapis.append("\"");// consola: "
        System.out.println(budujNapis);

//        System.out.printf(napis,12);
//        System.out.println("napis");
//        System.out.println(napisNull);
    }
}
