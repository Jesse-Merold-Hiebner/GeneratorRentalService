package za.ac.cput.factory;

/*
Entity : CityFactory.java
 Author: Mahad Hassan  (219122822)
Date: 30/03/2023
 */
import za.ac.cput.Util.Helper;
import za.ac.cput.domain.City;


public class CityFactory {

    public static City createCity(String cityName,String countryName){

        if (Helper.isNullorEmpty(cityName)|| Helper.isNullorEmpty(countryName))

            return null;
        String cityId = Helper.generateId();


        return new City.Builder()
                .setCityId(cityId)
                .setCityName(cityName)
                .setCountryName(countryName)
                .build();


    }
}
