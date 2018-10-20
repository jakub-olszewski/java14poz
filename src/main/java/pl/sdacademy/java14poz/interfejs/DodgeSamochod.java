package pl.sdacademy.java14poz.interfejs;

/**
 * DodgeSamochod
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 14:40
 **/
public class DodgeSamochod implements Samochod{

    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Dodge Car System");
        System.out.println("Wciśnij przycisk start");
    }

    @Override
    public void wylaczSilnik() {
        System.out.println("Przytrzymaj przycisk start");
    }

    @Override
    public void otworzSamochod(String DodgeKlucz) {
        klucz = DodgeKlucz;
    }
}
