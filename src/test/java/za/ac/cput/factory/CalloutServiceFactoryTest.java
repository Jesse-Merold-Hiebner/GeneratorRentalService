package za.ac.cput.factory;

//Author: Lutho Nondala (219369399)

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.CalloutService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CalloutServiceFactoryTest {
    private CalloutService calloutService;

    @Test
    void create(){
        Date date = new GregorianCalendar(2023, Calendar.APRIL, 7).getTime();
        calloutService = CalloutServiceFactory.createCalloutService(1, date);
        assertNotNull(calloutService);
    }
}