package pl.sdacademy.java14poz.interfejs;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.10.2018 14:44
 **/
public class Main {

    public static void main(String[] args) {

        Samochod huyndai = new HyundaiSamochod();
        huyndai.wlaczSilnik();

        Samochod fiat = new FiatSamochod();
        fiat.wlaczSilnik();

        Samochod seat = new SeatSamochod();
        seat.wlaczSilnik();

    }
}
