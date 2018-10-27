package pl.sdacademy.java14poz.dataiczas;
import java.time.Instant;
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

        // zmienna tekstowa z data ( dane wejsciowe )
        String dateString1 = "2018-07-01";

        // format wprowadzonej daty
        String formatDaty = "yyyy-MM-dd";

        // obiekt który pozwala formatowac date wedlug formatu
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(formatDaty);

        // parsowanie daty napisu na LocalDateTime
        LocalDateTime formatDateTime1 = LocalDateTime.parse(dateString1, formatter1);

        // instant time potrzebujemy do utworzenia Date (daty)
        Instant instantTime = formatDateTime1.atZone(ZoneId.systemDefault())
                .toInstant();
        System.out.println(instantTime);

        // zmienna date1 typu Date (data)
        // date1 zawiera metody deprecated czyli należy używać LocalDateTime
        Date date1 = java.util.Date.from(instantTime);
        System.out.println(date1);


//
//
//        LocalDateTime now = LocalDateTime.now();
//        String dateString2 = "04.08.2015 07:42:00";
//
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formatDateTimeString = now.format(formatter2);
//        System.out.println(formatDateTimeString);
//
//
//        // Konwersja String do Java Date
//        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
//
//        String dateString3 = "04.08.2015 07:42:00";
//        LocalDateTime date3 = LocalDateTime.parse(dateString3, formatter3);
//        System.out.println(date3);

//        DateTimeFormatter dtf = DateTimeFormatter.forPattern("yyyy-MM-dd");
//        LocalDate dt = dtf.parseLocalDate(date);
//
//        // Konwersja String do Java Date
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//        String dateString = "04.08.2015 07:42:00";
//        Date date = dateFormat.parse(dateString);
//        System.out.println(date);

    }
}
