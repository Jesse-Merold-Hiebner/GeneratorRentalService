package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.City;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {
    @Test
    public void testCityFactory(){

        City city = CityFactory.createCity("Cape Town","South Africa");

        System.out.println(city.toString());
        assertNotNull(city);
    }


}