package pl.sdacademy.java14poz;
//generate test
//alt + enter

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.10.2018 10:00
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");
        System.out.println("Witaj");

        int mojaLiczba;// zmienna z malej litery
        // jest to deklaracja

        mojaLiczba = 3; // inicjalizacja zmiennej
        System.out.println(mojaLiczba);

        int mojaDrugaLiczba = 3; // jednoczesnie
        // deklaracje i inicjalizacje

        System.out.println(Math.PI);
        // tworzenie zmiennej użytej w println
        String coZjemy = "Co na obiad?";
        System.out.println(coZjemy);
        // tworzenie zmiennej użytej w println
        String obiad = coNaObiad();
        System.out.println(obiad);
        System.out.println(poproszeFrytki(20));
        // wykonanie metody sumaLiczb
        System.out.println(sumaLiczb(1,2,3));
    }

    /**
     * Przyklad metody bez argumentowej
     *
     * @return co na obiad
     */
    public static String coNaObiad() {
        return "pomidorowa";
    }

    /**
     * Przyklad metody z argumentem
     *
     * @param kwota pieniedzy jakie dajemy
     * @return reszte z tranzakcji
     */
    public static int poproszeFrytki(int kwota) {
        return kwota - 5;
    }

    /**
     * Zadanie suma 3 liczb
     *
     * @param a liczba 1
     * @param b liczba 2
     * @param c liczba 3
     * @return suma trzech liczb
     */
    public static int sumaLiczb(int a, int b, int c) {
        return a + b + c;
    }
}
