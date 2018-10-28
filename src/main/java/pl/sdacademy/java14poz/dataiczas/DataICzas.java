package pl.sdacademy.java14poz.dataiczas;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * DataICzas
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.10.2018 12:13
 **/
public class DataICzas {

    public static void main(String[] args) {
        {
            // data w formie napisu
            String dataString = "2016-03-04 11:30";
            // ustalamy format daty na podstawie daty wyżej
            String formatDaty = "yyyy-MM-dd HH:mm";
            LocalDateTime dataWczesniejsza = utworzDateZeStringa(dataString, formatDaty);


            // zadanie stworz druga data z obecnego dnia
            // porownaj wykorzystujac metodę isAfter lub isBefore
            // do sprawdzenia ktora data jest wczesniejsza

            // przykład poniżej sprawdza dateTime (2016-03-04 11:30) jest
            // po dacie (2016-03-04 11:30)
            //dateTime.isAfter(dateTime)

            String napisDataDzisiejsza = "2018-10-28 09:37";
            LocalDateTime dataDzisiejsza = utworzDateZeStringa(napisDataDzisiejsza,formatDaty);

            System.out.println("Porównanie daty dzisiejszej do wcześniejszej: ");

            boolean jestWczesniejsza = dataWczesniejsza.isBefore(dataDzisiejsza);
            //return - używamy gdy chcemy zwrócić dane w metodzie
            //słowo te znajduje sie przeważnie nie końcu metody
            //jeżeli metoda posiada void return nie występuje

            if(jestWczesniejsza){
                //ten fragment kodu wykonuje się keidy warunek po if jest spełniony
                System.out.println("Dzisiejsza data jest późniejsza");
                System.out.printf("Data %s jest późniejsza od daty %s", dataDzisiejsza, dataWczesniejsza);
            }



            /*
            Teraz zajmiemy się przekształceniem daty na stringa
            według naszego formatu
             */
            System.out.println("\n-----------------------------------------------------\n");
            LocalDateTime obecnaData = LocalDateTime.now();
            String formatDatyBiurej = "dd.MM.yyyy HH:mm";
            // utworzenie formatera na podstawie wzorca formatDatyBiurowej
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDatyBiurej);
            // formater powyzej jest uzyty do sformatowania obecnej daty
            String formatDatyBiurowejNapis = obecnaData.format(formatter);
            System.out.printf("\nData dzisiejsza w formacie daty biurowej :\n%s \n",formatDatyBiurowejNapis);
            System.out.printf("\nData dzisiejsza bez formatu :\n%s \n",obecnaData);


            /*
            Zadanie zamien napis "2016-03-04" na date
             */
            // utworzenie zmiennej data jako napis
            String nowaData ="2016-03-04";
            // utworzenie formatuDaty jako napis
            String formatNowaData = "yyyy-MM-dd";
            // utworzenie formatera
            DateTimeFormatter formatterNowejDaty =
                    DateTimeFormatter.ofPattern(formatNowaData);
            // parsowanie
            LocalDate naszaData = LocalDate.parse(nowaData,formatterNowejDaty);
            // wypisanie daty
            System.out.printf("\nNasza data to: %s\n",naszaData);








            System.out.println("\nLocalDateTime:");
            System.out.println(dataDzisiejsza);

            Instant instantTime = dataDzisiejsza.atZone(ZoneId.systemDefault())
                    .toInstant();
            System.out.println("\nInstant time:");
            System.out.println(instantTime);

        }
        // ponizej blok kodu od { do }
        {
            String dataString = "2016-03-04";
            String formatDaty = "yyyy-MM-dd";

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
            LocalDate date = LocalDate.parse(dataString, formatter);

            System.out.println("\nLocalDate:");
            System.out.println(date);
        }
        {
            String formatDaty = "yyyy-MM-dd HH:mm";

        }
        {
            LocalDateTime teraz = LocalDateTime.now();
            String formatDaty = "yyyy-MM-dd HH:mm:ss";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
            String formatDateTimeString = teraz.format(formatter);
            System.out.printf("\nFormat daty %s :\n",formatDaty);
            System.out.println(formatDateTimeString);
        }
        {
            String dateString = "04.08.2015 07:42:00";
            String formatDaty = "dd.MM.yyyy HH:mm:ss";
            LocalDateTime date = utworzDateZeStringa(dateString, formatDaty);
            System.out.printf("\nFormat daty %s :\n",formatDaty);
            System.out.println(date);
        }

    }

    /**
     * Metoda zamienia date w postaci napisu na LocalDateTime
     * @param dataZPostaciNapisu
     * @param formatDaty
     * @return data
     */
    private static LocalDateTime utworzDateZeStringa(String dataZPostaciNapisu, String formatDaty) {
        // tworzymy formater ktory przyjmuje argument 'formatDaty'
        // ktory jest wzorcem daty
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);

        // parsowanie(przeksztalcenie)
        // napisu daty z uzyciem formatera w obiekt typu LocalDateTime
        return LocalDateTime.parse(dataZPostaciNapisu, formatter);
    }
}
