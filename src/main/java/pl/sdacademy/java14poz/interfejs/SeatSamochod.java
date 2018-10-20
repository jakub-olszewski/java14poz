package pl.sdacademy.java14poz.interfejs;

/**
 * SeatSamochod
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 14:40
 **/
public class SeatSamochod implements Samochod {

    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Seat System");
        System.out.println("wcisnij przycisk start");
    }

    @Override
    public void wylaczSilnik() {
        System.out.println("przytrzymaj przycisk start przez 3 sekundy");
    }

    @Override
    public void otworzSamochod(String podanyklucz) {
        klucz = podanyklucz;
    }

}
