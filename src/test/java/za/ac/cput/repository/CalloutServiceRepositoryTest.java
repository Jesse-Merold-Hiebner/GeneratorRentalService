package za.ac.cput.repository;

//Author: Lutho Nondala (219369399)

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.CalloutService;
import za.ac.cput.factory.CalloutServiceFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class CalloutServiceRepositoryTest {
    private  static CalloutServiceRepository REPOSITORY;
    private static CalloutService calloutService;

    @BeforeAll
    static void setUp(){
        Date date = new GregorianCalendar(2023, Calendar.APRIL, 7).getTime();
        calloutService = CalloutServiceFactory.createCalloutService(1, date);
        REPOSITORY = CalloutServiceRepository.getRepository();
    }

    @Test
    void getRepository() {
        assertNotNull(REPOSITORY);
    }

    @Test
    void getAll() {
        assertNotNull(REPOSITORY.getAll());
    }

    @Test
    void create() {
        CalloutService cs = REPOSITORY.create(calloutService);
        assertNotNull(cs);
    }

    @Test
    void read() {
        CalloutService cs = REPOSITORY.read(calloutService.getService_id());
        assertNotNull(cs);
    }

    @Test
    void update() {
        Date date = new GregorianCalendar(2023, Calendar.APRIL, 8).getTime();
        calloutService.setDate_of_callout(date);
        CalloutService cs = REPOSITORY.update(calloutService);
        assertNotNull(cs);
    }

    @AfterAll
    static void delete() {
        boolean DELETE = REPOSITORY.delete(calloutService.getService_id());
        assertTrue(DELETE);
    }
}