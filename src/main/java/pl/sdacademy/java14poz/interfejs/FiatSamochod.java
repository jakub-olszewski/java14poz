package pl.sdacademy.java14poz.interfejs;

/**
 * FiatSamochod
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 14:39
 **/
public class FiatSamochod implements Samochod {

    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Fiat Car System");
        System.out.println("wcisnij przycisk start");

    }

    @Override
    public void wylaczSilnik() {
        System.out.println("Fiat Car System");
        System.out.println("przytrzymaj przycisk start przez 3 sekundy");

    }

    @Override
    public void otworzSamochod(String podanyKlucz) {
        klucz = podanyKlucz;

    }

}
