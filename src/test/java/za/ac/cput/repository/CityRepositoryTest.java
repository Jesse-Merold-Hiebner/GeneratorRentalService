package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.City;
import za.ac.cput.factory.CityFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class CityRepositoryTest {

    private static CityRepository  repository = CityRepository.getRepository();

    public static City city = CityFactory.createCity("Cape Town ","South Africa");
    @Test
    void a_create() {
        City created = repository.create(city);
        assertEquals(city.getCityId(),created.getCityId());
        System.out.println("Created: " + created);

    }

    @Test
    void b_read() {
        City read = repository.read(city.getCityId());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void c_update() {
        City updated = new City.Builder().copy(city)
                .setCityName("JHB")
                .build();
        assertNotNull(repository.update(updated));

        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete() {
        boolean success = repository.delete(city.getCityId());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll() {
        System.out.println("Display All" );
        System.out.println( "Display All: " + repository.getAll());
    }
}