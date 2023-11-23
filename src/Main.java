import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 5, 17);

        LocalTime time = LocalTime.of(18, 20);

        LocalDateTime dateTime = LocalDateTime.of(date, time);


        ZoneId zoneId = ZoneId.of("Europe/Chisinau");
        ZonedDateTime zonedDateTime = dateTime.atZone(zoneId);

        zonedDateTime = zonedDateTime.plusMinutes(1);
        zonedDateTime = zonedDateTime.plusHours(1);
        zonedDateTime = zonedDateTime.plusDays(1);
        zonedDateTime = zonedDateTime.plusYears(1);

        System.out.println("Data: " + date);
        System.out.println("Ora: " + time);
        System.out.println("DateTime: " + dateTime);
        System.out.println("ZoneDateTime: " + zonedDateTime);
    }
}
