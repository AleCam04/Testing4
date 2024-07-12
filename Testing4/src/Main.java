import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try{
            OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            int year = dateTime.getYear();
            String month = dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
            int day = dateTime.getDayOfMonth();
            String dayOfWeek = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);

            System.out.println(year + "\n" + month + "\n" + day + "\n" + dayOfWeek);
        } catch (DateTimeParseException e) {
            System.err.println("La data non è stata formattata correttamente");
        }

    }
}