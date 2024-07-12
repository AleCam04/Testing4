import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();
    OffsetDateTime testDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void testYear() {
        int year = testDate.getYear();
        assertEquals(2023,year,"Controlla se viene preso l'anno");
    }

    @Test
    void testMonth() {
        String month = testDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertEquals("marzo",month,"Controlla se viene preso il mese");
    }

    @Test
    void testDayOfMonth() {
        int day = testDate.getDayOfMonth();
        assertEquals(1,day,"Controlla se viene preso il giorno del mese");
    }

    @Test
    void testDayOfWeek() {
        String dayOfWeek = testDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertEquals("mercoledì",dayOfWeek,"Controlla se viene preso il giorno della settimana");
    }


    @Test
    public void testException(){
        assertThrows(DateTimeParseException.class, () ->{
            OffsetDateTime.parse("2023-03-0113:00:00Z");
        }, "Controlla se il formato è sbagliato viene lanciata l'eccezione");
    }
}