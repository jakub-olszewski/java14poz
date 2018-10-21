package pl.sdacademy.java14poz.sklep;

/**
 * Zamowienie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 21.10.2018 11:27
 **/
public class Zamowienie {

    int numer;
    float cena;

    public Zamowienie(int podajNumer, float podajCene) {
        numer = podajNumer;
        cena = podajCene;
    }

    public Zamowienie(int podajNumer, Double podajCene) {
        numer = podajNumer;
        cena = podajCene.floatValue();
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numer=" + numer +
                ", cena=" + cena +
                '}';
    }

    public float pobierzCene(){
        return cena;
    }

}
