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
    }

    /**
     * Przyklad metody bez argumentowej
     * @return co na obiad
     */
    public static String coNaObiad(){
        return "pomidorowa";
    }

    /**
     * Przyklad metody z argumentem
     * @param kwota pieniedzy jakie dajemy
     * @return reszte z tranzakcji
     */
    public static int poproszeFrytki(int kwota){
        return kwota-5;
    }
}
